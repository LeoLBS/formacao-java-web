//Para atender às exigências do sistema, crie um programa que converta a
//quantidade de double para int, garantindo que os valores sejam adequados ao formato aceito.

public class Main {
    public static void main(String[] args) {
        double valorDouble = 152.9;

        int valorInteiro = (int) valorDouble;

        System.out.println("Valor inteiro do produto: " + valorInteiro);

        valorInteiro = (int) Math.ceil(valorDouble);

        System.out.println("Arredondando para cima: " + valorInteiro);

        valorInteiro = (int) Math.floor(valorDouble);

        System.out.println("Arredondando para baixo: " + valorInteiro);
    }
}
