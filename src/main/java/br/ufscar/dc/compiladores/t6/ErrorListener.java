package br.ufscar.dc.compiladores.t6;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

public class ErrorListener implements ANTLRErrorListener {

    Output sp;

    public ErrorListener(Output sp) {
        this.sp = sp;
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void syntaxError(Recognizer <?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg, RecognitionException e){
        if(sp.HasError()) {
            return;
        }
        Token tk = (Token) offendingSymbol;
        String text = tk.getText();

        if (text.equals("<EOF>")) {
            text = "EOF";
        }

        sp.println("Linha " + line + ": erro sintatico proximo a " + text);
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }
}