import java.util.Scanner;

public class ExercicioAumentoSalario {

    public static void main(String[] args) {
        
        Scanner salario = new Scanner (System.in);

        double salarioAtual;

        System.out.print("Digite o seu salário atual para calcularmos o valor do seu aumento: ");
        salarioAtual = salario.nextDouble();

        if(salarioAtual<= 1500 && salarioAtual<1750){

            System.out.print("O valor do seu novo salário será: " + ((salarioAtual)+ (salarioAtual*12/100)));

        } else if (salarioAtual <= 17500 && salarioAtual < 2000){

            System.out.print("O valor do seu novo salário será: " + ((salarioAtual)+ (salarioAtual*10/100)));
            
        } else if (salarioAtual <= 2000 && salarioAtual < 3000){

            System.out.print("O valor do seu novo salário será: " + ((salarioAtual)+ (salarioAtual*7/100)));

        } else if (salarioAtual > 3000) {

            System.out.print("O valor do seu novo salário será: " + ((salarioAtual)+ (salarioAtual*5/100)));

        }

    }

}
