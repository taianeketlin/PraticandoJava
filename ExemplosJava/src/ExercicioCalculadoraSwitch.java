import java.util.Scanner;

public class ExercicioCalculadoraSwitch {
    
    public static void main(String[] args) {
        
        Scanner tipocalculo = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numeroReal = tipocalculo.nextDouble();

        System.out.println("Digite o desejado: 101 = raiz quadrada , 102 = metade , 103 = 10% do número, 104 = dobro do número");
        int valorDesejado =  tipocalculo.nextInt();
                
        switch(valorDesejado){
            case 101:
            System.out.print(Math.sqrt(numeroReal));
            break;
            case 102: 
            System.out.print(numeroReal/2);
            break;
            case 103:
            System.out.print(0.10*numeroReal);
            break;
            case 104:
            System.out.print(2*numeroReal);
            break;
            default:
            break;
            

        }

    }

}
