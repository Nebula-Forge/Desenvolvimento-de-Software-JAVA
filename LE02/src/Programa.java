import br.edu.up.controller.*;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner scanner = ScannerUtil.getScanner();

        System.out.println("Escolha um exercício de 1 a 15:");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                Exercicio01.Executar();
                break;
            case 2:
                Exercicio02.Executar();
                break;
            case 3:
                Exercicio03.Executar();
                break;
            case 4:
                Exercicio04.Executar();
                break;
            case 5:
                Exercicio05.Executar();
                break;
            case 6:
                Exercicio06.Executar();
                break;
            case 7:
                Exercicio07.Executar();
                break;
            case 8:
                Exercicio08.Executar();
                break;
            case 9:
                Exercicio09.Executar();
                break;
            case 10:
                Exercicio10.Executar();
                break;
            case 11:
                Exercicio11.Executar();
                break;
            case 12:
                Exercicio12.Executar();
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
