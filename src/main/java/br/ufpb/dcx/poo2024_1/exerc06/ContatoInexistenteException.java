package br.ufpb.dcx.poo2024_1.exerc06;

public class ContatoInexistenteException extends Exception {
    public ContatoInexistenteException() { super("Contato não existe!"); }
    public ContatoInexistenteException(String msg) { super(msg); }
}
