//Você está planejando uma viagem de carro e deseja calcular quantos
//quilômetros poderá percorrer com o combustível disponível no tanque. Para isso, você precisa considerar:
//
//O consumo médio do veículo (km/l)
//A capacidade total do tanque de combustível (litros)
//A quantidade de combustível disponível no momento (litros)
//A distância da viagem planejada (km)
//
//Com essas informações, o programa deverá calcular:
//
//A autonomia máxima do carro (quantos quilômetros pode percorrer com um tanque cheio).
//A autonomia atual, baseada na quantidade de combustível disponível.
//Se a quantidade de combustível atual será suficiente para percorrer um determinado trajeto informado pelo usuário.

public class Main {
    public static void main(String[] args) {
      double consumoMedio = 12.5,
              capacidadeTanque = 50,
              totalDisponivel = 25,
              distanciaViagem = 300,
              autonomiaMaxima,
              autonomiaAtual;

      autonomiaMaxima = consumoMedio * capacidadeTanque;
      autonomiaAtual = consumoMedio * totalDisponivel;

      System.out.println("Autonomia máxima: " + autonomiaMaxima + "km");
      System.out.println("Autonomia atual: " + autonomiaAtual + "km");

      if (distanciaViagem <= autonomiaAtual){
          System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
      }else {
          System.out.println("Você não conseguirá completar a viagem, precisa abastecer!!");
      }

    }
}
