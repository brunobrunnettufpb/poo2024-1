package br.ufpb.dcx.ayla.quiz;

public class Sistema {
    public static void main(String[] args) {
        System.out.println("Oi");

        Pergunta pergunta = new PerguntaDissertativa();
        System.out.println(pergunta.toString());
    }
}
