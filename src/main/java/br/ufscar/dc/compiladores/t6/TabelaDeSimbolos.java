package br.ufscar.dc.compiladores.t6;

import java.util.ArrayList;
import java.util.List;


public class TabelaDeSimbolos {
    private String escopo;
    private List<Simbolo> simbolos;

    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<>();
        this.escopo = escopo;
    }

    public void adicionarSimbolo(String nome, String tipo, String tipoDeDado) {
        simbolos.add(new Simbolo(nome, tipo, tipoDeDado));
    }

    public void adicionarSimbolo(Simbolo simbolo) {
        simbolos.add(simbolo);
    }

    public boolean existeSimbolo(String nome) {
        for(Simbolo etds : simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public String getEscopo(){
        return escopo;
    }

    public Simbolo getSimbolo(String nome){
        for(Simbolo etds : simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds;
            }
        }
        return null;
    }

    public List<Simbolo> getListaSimbolos(){
        return simbolos;
    }
}