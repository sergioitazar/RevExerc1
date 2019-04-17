package br.com.digitalhouse;

public class Professor {
    private String professorNome;
    private String professorRa;
    private String professorAula;
    private String professorChamada;

    // construtor criado com as teclas alt + insert
    public Professor(String professorNome, String professorRa, String professorAula, String professorChamada) {
        this.professorNome = professorNome;
        this.professorRa = professorRa;
        this.professorAula = professorAula;
        this.professorChamada = professorChamada;
    }

    // metodos criados a com as teclas alt + insert
    public String getProfessorNome() {
        return professorNome;
    }

    public void setProfessorNome(String professorNome) {
        this.professorNome = professorNome;
    }

    public String getProfessorRa() {
        return professorRa;
    }

    public void setProfessorRa(String professorRa) {
        this.professorRa = professorRa;
    }

    public String getProfessorAula() {
        return professorAula;
    }

    public void setProfessorAula(String professorAula) {
        this.professorAula = professorAula;
    }

    public String getProfessorChamada() {
        return professorChamada;
    }

    public void setProfessorChamada(String professorChamada) {
        this.professorChamada = professorChamada;
    }
}
