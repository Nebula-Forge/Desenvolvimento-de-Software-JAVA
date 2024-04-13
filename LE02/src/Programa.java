import br.edu.up.controller.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Escolha um exercício de 1 a 15:");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                Exercicio01.CalculoMedia();
                break;
            case 2:
                Exercicio02.ValorDePosicoes();
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:

                break;
            case 15:

                break;
            default:
                ScannerUtil.closeScanner();
                System.exit(0);
        }

    }
}
