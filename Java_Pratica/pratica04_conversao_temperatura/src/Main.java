//Crie um programa que receba uma temperatura em graus Celsius (int) e exiba a
//temperatura convertida em graus Fahrenheit (double). A fórmula para conversão é:
//Fahrenheit = (Celsius * 9 / 5) + 32


public class Main {
    public static void main(String[] args) {
        int temperaturaCelsius = 22;
        double temperaturaFahrenheit;

        temperaturaFahrenheit = ((double)temperaturaCelsius * 9 / 5) + 32;  // Add o (double) ao lado da variável temperaturaCelsius para a conversão e assim retornar 71.6 e não 71.0;

        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
    }
}
