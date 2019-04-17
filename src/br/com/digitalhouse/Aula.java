package br.com.digitalhouse;

public class Aula {
    private String aulaMateria;
    private int aulaHoraInicio;
    private int aulaHoraTermino;


// construtor criado com as teclas alt + ins
    public Aula(String aulaMateria, int aulaHoraInicio, int aulaHoraTermino) {
        this.aulaMateria = aulaMateria;
        this.aulaHoraInicio = aulaHoraInicio;
        this.aulaHoraTermino = aulaHoraTermino;
    }

    public String getAulaMateria() {
        return aulaMateria;
    }

    public void setAulaMateria(String aulaMateria) {
        this.aulaMateria = aulaMateria;
    }

    public int getAulaHoraInicio() {
        return aulaHoraInicio;
    }

    public void setAulaHoraInicio(int aulaHoraInicio) {
        this.aulaHoraInicio = aulaHoraInicio;
    }

    public int getAulaHoraTermino() {
        return aulaHoraTermino;
    }

    public void setAulaHoraTermino(int aulaHoraTermino) {
        this.aulaHoraTermino = aulaHoraTermino;
    }
}
