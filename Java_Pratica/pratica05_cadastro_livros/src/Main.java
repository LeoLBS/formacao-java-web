//Você está iniciando suas atividades como pessoa desenvolvedora e
//foi designado para criar um programa de cadastro de livros que será escolhida através de um único caractere.
//O sistema armazenar em variáveis:
//
//Título
//Autor
//Número de páginas
//Preço de um livro
//Categoria do livro As categorias disponíveis são:
//F - Ficção
//N - Não-ficção
//T - Tecnologia
//H - História
//
//Escreva um programa que armazene em variáveis as informações de um livro e com base na
//categoria armazenada exiba uma mensagem de confirmação de acordo com o que foi escolhido.

public class Main {
    public static void main(String[] args) {
        String tituloLivro, autorLivro, categoriaLivro;
        int numeroPagina;
        double precoLivro;
        char tipoCategoria = 'H';

        if( tipoCategoria == 'F'){
            categoriaLivro = "Ficção";
            tituloLivro = "Jogos Vorazes";
            autorLivro = "Suzanne Collins";
            numeroPagina = 400;
            precoLivro = 45.96;
        } else if (tipoCategoria == 'N') {
            categoriaLivro = "Não-ficção";
            tituloLivro = "Uma Breve História do Tempo";
            autorLivro = "Stephen Hawking";
            numeroPagina = 256;
            precoLivro = 43.34;
        } else if (tipoCategoria == 'T') {
            categoriaLivro = "Tecnologia";
            tituloLivro = "Entendendo Algoritmos";
            autorLivro = "Aditya Y. Bhargava";
            numeroPagina = 400;
            precoLivro = 46;
        } else if (tipoCategoria == 'H') {
            categoriaLivro = "História";
            tituloLivro = "Uma Breve História do Mundo";
            autorLivro = "Geoffrey Blainey";
            numeroPagina = 336;
            precoLivro = 88;
        }else{
            categoriaLivro = "";
            tituloLivro = "";
            autorLivro = "";
            numeroPagina = 0;
            precoLivro = 0;
        }

        System.out.println("Livro cadastrado: " + tituloLivro + ", de " + autorLivro + ". Ele possui " + numeroPagina + " páginas, custa R$" + precoLivro + " e pertence à categoria " + categoriaLivro);
    }
}
