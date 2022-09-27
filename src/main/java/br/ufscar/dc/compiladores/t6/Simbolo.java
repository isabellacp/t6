package br.ufscar.dc.compiladores.t6;

public class Simbolo {
    private String nome, tipo, tipoDeDado;

    public Simbolo(String nome, String tipo, String tipoDeDado) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoDeDado = tipoDeDado;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTipoDeDado(){
        return tipoDeDado;
    }
}