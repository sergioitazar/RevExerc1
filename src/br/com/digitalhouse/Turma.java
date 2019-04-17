package br.com.digitalhouse;

public class Turma {
    private String turmaNome;
    private String turmaCurso;

    public Turma(String turmaNome, String turmaCurso) {
        this.turmaNome = turmaNome;
        this.turmaCurso = turmaCurso;
    }

    public String getTurmaNome() {
        return turmaNome;
    }

    public void setTurmaNome(String turmaNome) {
        this.turmaNome = turmaNome;
    }

    public String getTurmaCurso() {
        return turmaCurso;
    }

    public void setTurmaCurso(String turmaCurso) {
        this.turmaCurso = turmaCurso;
    }
}
