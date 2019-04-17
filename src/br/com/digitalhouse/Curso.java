package br.com.digitalhouse;

public class Curso {
    private String cursoNome;
    private String cursoConjuntoAula;
    private String cursoListaAlunos;
    private String cursoProfessor;

    public Curso(String cursoNome, String cursoConjuntoAula, String cursoListaAlunos, String cursoProfessor) {
        this.cursoNome = cursoNome;
        this.cursoConjuntoAula = cursoConjuntoAula;
        this.cursoListaAlunos = cursoListaAlunos;
        this.cursoProfessor = cursoProfessor;
    }

    public String getCursoNome() {
        return cursoNome;
    }

    public void setCursoNome(String cursoNome) {
        this.cursoNome = cursoNome;
    }

    public String getCursoConjuntoAula() {
        return cursoConjuntoAula;
    }

    public void setCursoConjuntoAula(String cursoConjuntoAula) {
        this.cursoConjuntoAula = cursoConjuntoAula;
    }

    public String getCursoListaAlunos() {
        return cursoListaAlunos;
    }

    public void setCursoListaAlunos(String cursoListaAlunos) {
        this.cursoListaAlunos = cursoListaAlunos;
    }

    public String getCursoProfessor() {
        return cursoProfessor;
    }

    public void setCursoProfessor(String cursoProfessor) {
        this.cursoProfessor = cursoProfessor;
    }
}

