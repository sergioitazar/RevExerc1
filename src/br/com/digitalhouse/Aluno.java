package br.com.digitalhouse;

public class Aluno {
    private String alunoRa;
    private String alunoNome;
    private String alunoSobrenome;

    public Aluno(String alunoRa, String alunoNome, String alunoSobrenome) {
        this.alunoRa = alunoRa;
        this.alunoNome = alunoNome;
        this.alunoSobrenome = alunoSobrenome;
    }

    public String getAlunoRa() {
        return alunoRa;
    }

    public void setAlunoRa(String alunoRa) {
        this.alunoRa = alunoRa;
    }

    public String getAlunoNome() {
        return alunoNome;
    }

    public void setAlunoNome(String alunoNome) {
        this.alunoNome = alunoNome;
    }

    public String getAlunoSobrenome() {
        return alunoSobrenome;
    }

    public void setAlunoSobrenome(String alunoSobrenome) {
        this.alunoSobrenome = alunoSobrenome;
    }
}


