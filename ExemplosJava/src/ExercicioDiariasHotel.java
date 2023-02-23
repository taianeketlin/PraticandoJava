import java.util.Scanner;

public class ExercicioDiariasHotel {
    public static void main(String[] args) {
        
        Scanner pagamento = new Scanner (System.in);

        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = pagamento.nextLine();
    
        System.out.print("Digite a quantidade de diárias: ");
        int diariasHotel = pagamento.nextInt();

        switch (diariasHotel) {

            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14:
            System.out.print("O valor pago por " + nomeCliente + " será " + (60 + diariasHotel * 5.50));
            break;
            case 15:
            System.out.print("O valor pago por " + nomeCliente + " será " + (60 + diariasHotel * 6));
            break;
            default:
            System.out.print("O valor pago por " + nomeCliente + " será " + (60 + diariasHotel * 8));

        }

    }
    
}
