import java.util.Scanner;

public class ExercicioVendaCarro {
    public static void main(String[] args) {

        Scanner vendendocarro = new Scanner (System.in);

      
        System.out.print("Digite o valor da venda:");
        double valorVenda = vendendocarro.nextDouble();

        System.out.println("Condições de pagamento:");
        System.out.println("1. Venda a Vista: Desconto 10%");
        System.out.println("2. Venda a Prazo 30 dias : Desconto de 5%");
        System.out.println("3. Venda a Prazo 60 dias : Mesmo preço");
        System.out.println("4. Venda a Prazo 90 dias : Acréscimo de 5%");
        System.out.println("5. Venda Com Cartão de Débito : Desconto de 8%");
        System.out.println("6. Venda Com Cartão de Crédito : Desconto de 7%");
        
        System.out.print("");

        System.out.print("Digite como deseja realizar a compra: ");
        int menu = vendendocarro.nextInt();

        double vendaVista = valorVenda - (valorVenda*0.10);
        double vendaPrazoTrinta = valorVenda - (valorVenda*0.05);
        double vendaPrazoSessenta = valorVenda;
        double vendaPrazoNoventa = valorVenda + (valorVenda*0.05);
        double vendaCartaoDebito = valorVenda - (valorVenda*0.08);
        double vendaCartaoCredito = valorVenda - (valorVenda*0.07);

        switch(menu){
            case 1:
            System.out.print("O valor pago será de R$ " + vendaVista);
            break;
            case 2:
            System.out.print("O valor pago será de R$ " + vendaPrazoTrinta);
            break;
            case 3:
            System.out.print("O valor pago será de R$ " + vendaPrazoSessenta);
            break;
            case 4:
            System.out.print("O valor pago será de R$ " + vendaPrazoNoventa);
            break;
            case 5:
            System.out.print("O valor pago será de R$ " + vendaCartaoDebito);
            break;          
            case 6:
            System.out.print("O valor pago será de R$ " + vendaCartaoCredito);
            break;          
            default:
            break;
                    

        }
    }
    
}

