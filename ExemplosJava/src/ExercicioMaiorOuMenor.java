import java.util.Scanner;

public class ExercicioMaiorOuMenor {

    public static void main(String[] args) {
        
        int valorUm, valorDois;
        
        Scanner maior = new Scanner (System.in);

        System.out.print("Informe o primeiro número:");
        valorUm = maior.nextInt();

        System.out.print("Informe o outro número:");
        valorDois = maior.nextInt();

        System.out.println("O maior número é " + ((valorUm > valorDois)? valorUm : valorDois));
        System.out.println("O menor número é " + ((valorUm < valorDois)? valorUm : valorDois));



    

    }
    
}
