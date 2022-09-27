package br.ufscar.dc.compiladores.t6;


import br.ufscar.dc.compiladores.twine.LittleTwineBaseVisitor;
import br.ufscar.dc.compiladores.twine.LittleTwineParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class Compiler extends LittleTwineBaseVisitor<String> {
    private int current_id = 1;
    public static List<String> errosSemanticos = new ArrayList<>();
    public Output sp;
    private PilhaDeTabelas pilhaDeTabelas;

    public Compiler(Output sp) {
        this.sp = sp;
    }

    @Override
    public String visitBody(LittleTwineParser.BodyContext ctx) {
        return super.visitBody(ctx);
    }

    @Override
    public String visitId(LittleTwineParser.IdContext ctx) {
        return super.visitId(ctx);
    }

    @Override
    public String visitId_reference(LittleTwineParser.Id_referenceContext ctx) {
        sp.printCode("[["+ctx.CADEIA_CONTEUDO().getText()+"->"+ctx.IDENT().getText()+"]]");
        return null;
    }

    @Override
    public String visitStatement(LittleTwineParser.StatementContext ctx) {
        sp.printCode(String.format("<tw-passagedata pid=\"%d\" name=\"%s\" tags=\"\" position=\"775,425\" size=\"100,100\">\n"
               , current_id++, ctx.header().id().IDENT().getText()));
        visitContent(ctx.content());
        sp.printCode("</tw-passagedata>\n");
        return null;
    }


    @Override
    public String visitHeader(LittleTwineParser.HeaderContext ctx) {
        return super.visitHeader(ctx);
    }
    @Override
    public String visitTerminal(TerminalNode node) {
        sp.printCode(node.getText());
        return null;
    }
    @Override
    public String visitContent(LittleTwineParser.ContentContext ctx) {
        for (var child:ctx.children) {
            if(child instanceof LittleTwineParser.Id_referenceContext) {
                visitId_reference((LittleTwineParser.Id_referenceContext) child);
            } else {
                visitTerminal((TerminalNode) child);
            }
        }
        return null;
    }
}