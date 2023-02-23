import java.util.Scanner;

public class ExercicioMediaCandidatos {
    public static void main(String[] args) {
        
        try (Scanner prova = new Scanner (System.in)){

            
            System.out.print("Digite o nome do candidato: ");
            String nomeCandidato = prova.nextLine();

            System.out.print("Digite a nota de português: ");
            Double notaPortugues = prova.nextDouble();

            System.out.print("Digite a nota de matemática: ");
            Double notaMatematica = prova.nextDouble();

            System.out.print("Digite a nota de conhecimentos gerais: ");
            Double notaCGerais = prova.nextDouble();


            double media = (notaPortugues+notaMatematica+notaCGerais)/3;

            if(media>=7 && notaCGerais >5 && notaMatematica >5 && notaPortugues > 5){

            System.out.println("Parabéns! Você foi aprovado. Sua média no concurso foi " + media);
            } 
            else {

                System.out.println("Infelizmente você não faz parte da lista dos aprovados. A sua média foi "+ media);
            }
            
         

        }

    }
}
