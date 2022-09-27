package br.ufscar.dc.compiladores.t6;


import br.ufscar.dc.compiladores.twine.LittleTwineBaseVisitor;
import br.ufscar.dc.compiladores.twine.LittleTwineParser;

import java.util.*;

public class Semantic extends LittleTwineBaseVisitor<String> {
    public HashMap<String, String> identificadoresNaoEncontrados = new HashMap<String, String>();
    public Output sp;
    private PilhaDeTabelas pilhaDeTabelas;

    public Semantic(Output sp) {
        this.sp = sp;
        pilhaDeTabelas = new PilhaDeTabelas();
    }

    @Override
    public String visitBody(LittleTwineParser.BodyContext ctx) {

        super.visitBody(ctx);
        for(var err:identificadoresNaoEncontrados.values()) { // checo depois, já que é necessário olhar o arquivo inteiro para ver se temos ou não referencias invalidas
            sp.println(err);
        }
        return null;
    }

    @Override
    public String visitId(LittleTwineParser.IdContext ctx) {
        return super.visitId(ctx);
    }

    @Override
    public String visitId_reference(LittleTwineParser.Id_referenceContext ctx) {
        var id_text = ctx.IDENT().getText();
        if(!pilhaDeTabelas.ids.contains(id_text)) {
            identificadoresNaoEncontrados.put(id_text,"Linha " + ctx.IDENT().getSymbol().getLine() + ": identificador " + id_text + " não declarado");
        }
        return super.visitId_reference(ctx);
    }

    @Override
    public String visitStatement(LittleTwineParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }


    @Override
    public String visitHeader(LittleTwineParser.HeaderContext ctx) {
        var id_text = ctx.id().IDENT().getText();
        identificadoresNaoEncontrados.remove(id_text);
        if(pilhaDeTabelas.ids.contains(id_text)) { // caso esse identificador ja exista
            sp.println("Linha " + ctx.id().start.getLine() + ": identificador " + id_text + " ja declarado anteriormente");
        } else {
            pilhaDeTabelas.ids.add(id_text); // caso não exista, então adicionamos na lista de identificadores
        }
        return super.visitHeader(ctx);
    }

    @Override
    public String visitContent(LittleTwineParser.ContentContext ctx) {
        return super.visitContent(ctx);
    }
}