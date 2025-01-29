public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nomeDoFilme = "Os Incriveis";
        meuFilme.anoDeLancamento = 2010;
        meuFilme.duracaoEmMinutos = 120;
        meuFilme.incluidoNoPlano = true;

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(8);
        System.out.println("Media de avaliações do filme: " + meuFilme.pegaMediaAvaliacoes());
    }
}

