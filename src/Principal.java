public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.exibeFichaTecnica();
    }
}
