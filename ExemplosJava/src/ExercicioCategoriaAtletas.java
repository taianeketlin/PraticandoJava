import java.util.Scanner;

public class ExercicioCategoriaAtletas {
    public static void main(String[] args) {
        Scanner categoria = new Scanner (System.in);

        System.out.print("Digite o nome do atleta: ");
        String nomeAtleta = categoria.nextLine();

        System.out.print("Digite a idade do atleta: ");
        int idadeAtleta = categoria.nextInt();

        switch (idadeAtleta){

            case 5,6,7,8,9,10:
            System.out.print("Atleta da categoria Infantil.");
            break;
            case 11,12,13,14,15:
            System.out.print("Atleta da categoria Juvenil.");
            break;
            case 16,17,18,19,20:
            System.out.print("Atleta da categoria Junior.");
            break;
            default:
            System.out.print("Atleta da categoria Profissional.");




        }


    }
}
