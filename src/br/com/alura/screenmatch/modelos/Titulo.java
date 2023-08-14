package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome; // get e set
    private int anoDeLancamento; // get e set
    private boolean incluidoNoPlano; // get e set
    private double somaDasAvaliacoes;
    private double avaliacaoMedia;  // get
    private int totalDeAvaliacoes = 0; // get
    private int duracaoEmMinutos; // get e set

    public void exibeFichaTecnica() {
        System.out.println("""
                -------------------------
                %s
                -------------------------
                Ano de lançamento:  %d
                Avaliação:          %.2f
                Duração (minutos):  %d
                """.formatted(this.nome, this.anoDeLancamento, this.avaliacaoMedia, this.duracaoEmMinutos));
    }

    public void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
        this.avaliacaoMedia = this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
}
