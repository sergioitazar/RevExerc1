package br.com.digitalhouse;

public class Principal{
    public static void main(String[] args) {

        // construir aluno alimentar a classe aluno - criar objeto
        Aluno joao = new Aluno("1234A","Joao","Roberto");
        Aluno maria = new Aluno("2345B","Maria","Correa");
        Aluno sergio = new Aluno ("3456C","Sergio","Souza");
        Aluno chico = new Aluno ("2222H","Chico","Xavier");

// construir professor - alimentar a classe professor que vira objeto
        Professor tario = new Professor ("Tairo","44A","Android","2");
        Professor jessica = new Professor("Jessica","55J","Java","3");
        

    }
}