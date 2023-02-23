import java.util.Scanner;

public class ExercicioMediaSwitch {
    public static void main(String[] args) {
        Scanner estudo = new Scanner (System.in);
        
        System.out.print("Digite a primeira nota: ");
        int notaUm = estudo.nextInt();

        System.out.print("Digite a segunda nota: ");
        int notaDois = estudo.nextInt();

        int mediaAluno = (notaUm+notaDois)/2;
        
        switch(mediaAluno){

            case 7,8,9,10:
            System.out.print("Aprovado!");
            break;
            case 6,5,4:
            System.out.print("Prova final!");
            break;
            default:
            System.out.print("Reprovado!");



        }
        System.out.println(" ");
        System.out.println(mediaAluno);

    }
}
