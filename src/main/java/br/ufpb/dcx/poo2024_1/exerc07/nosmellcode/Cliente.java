package br.ufpb.dcx.poo2024_1.exerc07.nosmellcode;

//Mesmo código sem Smell Code
public class Cliente {
    private String nome;
    private CEP cep;
    private Data aniversario;

    public Cliente(String nome, CEP cep, Data aniversario) {
        this.nome = nome;
        this.cep = cep;
        this.aniversario = aniversario;
    }

    //Classe criada para remover o Smell Code
    public class CEP {
        private String CEP;

        public CEP(String CEP) {
            this.CEP = CEP;
        }

        public int getCodRegiao() {
            return this.CEP.charAt(0);
        }
        public int getCodSubRegiao() {
            return this.CEP.charAt(1);
        }
    }

    //Classe criada para remover o Smell Code
    public class Data {
        private int dia;
        private int mes;
        private int ano;

        public Data(int dia, int mes, int ano) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
}
