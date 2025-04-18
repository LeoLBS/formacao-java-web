package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classifica){
        if(classifica.getClassificacao() >= 4){
            System.out.println("Top avaliações, muito bem avaliado!");
        }else if((classifica.getClassificacao() >= 2) && (classifica.getClassificacao() <= 3)){
            System.out.println("Bem avaliado!");
        }else{
            System.out.println("Adicionar para ver mais tarde!");
        }
    }
}
