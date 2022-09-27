package br.ufscar.dc.compiladores.t6;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import br.ufscar.dc.compiladores.twine.LittleTwineLexer;
import br.ufscar.dc.compiladores.twine.LittleTwineParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {

    public static void main(String[] args) throws IOException {
        Output sp = new Output(); // Instancia uma classe que vamos usar para salvar erros
        CharStream input = CharStreams.fromFileName(args[0], StandardCharsets.UTF_8);
        LittleTwineLexer lexer = new LittleTwineLexer(input); // Instancia o lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer); // Instancia o token stream
        LittleTwineParser parser = new LittleTwineParser(tokens); // Carrega os tokens no parser
        parser.removeErrorListeners(); // Limpa os error listeners só por via das duvidas
        parser.addErrorListener(new ErrorListener(sp)); // Conecta o error listener, que salva os erros no Output, ao parser
        LittleTwineParser.BodyContext tree = parser.body(); // faz o parsing efetivamente
        Semantic semantic = new Semantic(sp);

        // Parsing semantico.
        semantic.visitBody(tree);
        File fd = new File(args[1]);
        fd.createNewFile();
        var content = "";
        if (!sp.HasError()) {
            Compiler compiler = new Compiler(sp);
            compiler.visitBody(tree);
            Path path = Paths.get("templates/template.html"); // utilizamos um template com o boilerplate necessário (o twine gera arquivos unicos cheios de javascript)
            content = Files.readString(path, StandardCharsets.UTF_8);
            content = content.replace("{{content}}", sp.toString()); // aqui inserimos o conteudo gerado pelo compilador no lugar da string {{content}}
        } else {
            content = sp.toString();
        }
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fd), StandardCharsets.UTF_8)); // salva a saida do parsing em um arquivo
        pw.print(content);
        pw.close();


    }
}