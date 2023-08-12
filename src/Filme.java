public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    double avaliacaoMedia;
    int totalDeAvaliacoes = 0;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("""
                -------------------------
                %s
                -------------------------
                Ano de lançamento:  %d
                Avaliação:          %.2f
                Duração (minutos):  %d
                """.formatted(this.nome, this.anoDeLancamento, this.avaliacaoMedia, this.duracaoEmMinutos));
    }

    void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
        this.avaliacaoMedia = this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }
}
