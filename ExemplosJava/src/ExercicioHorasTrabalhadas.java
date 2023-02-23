import java.util.Scanner;

public class ExercicioHorasTrabalhadas {


    public static void main(String[] args) {    

                                     
       try (Scanner salario = new Scanner(System.in)) {


           System.out.print("Digite a quantidade de horas trabalhadas no mês: " );
           Float ht = salario.nextFloat();

           System.out.print("Digite o valor pago pela hora trabalhada: " );
           Float vh = salario.nextFloat();

           System.out.print("Digite o percentual de desconto: " );
           Float pd = salario.nextFloat();


           Float bruto = ht*vh;
           Float desconto = (pd/100)*bruto;
           Float liquido = bruto - desconto;
                             
           System.out.println("Neste mês o total de horas trabalhadas foram: " + ht);
           System.out.println("O salário bruto: " + bruto);
           System.out.println("O valor descontado: " + desconto);
           System.out.println("O salário líquido:: " + liquido);
       }



   }

} 