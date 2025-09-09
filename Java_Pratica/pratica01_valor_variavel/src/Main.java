//Você está começando seus primeiros passos na programação em
//Java e deseja reforçar seu aprendizado sobre declaração de variáveis.

//Escreva um programa que declare variáveis para o seu nome,
//idade, altura e se você é estudante, utilizando os tipos apropriados, e depois exiba os valores armazenados.

public class Main {
    public static void main(String[] args) {
        String nome;
        int idade;
        double altura;
        boolean estudante;

        nome = "Leonardo";
        idade = 22;
        altura = 1.75;
        estudante = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Estudante: " + estudante);
    }
}
