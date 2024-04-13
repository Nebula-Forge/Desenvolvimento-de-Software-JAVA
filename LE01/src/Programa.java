
import br.edu.up.controller.*;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        System.out.println("Digite um número de 1 a 20 para escolher entre os exercícios:");

        Scanner scanner = ScannerUtil.getScanner();

        int escolha = scanner.nextInt();

        switch (escolha) {
        case 1:
            Exercicio01.ReceberNumero();
            break;
        case 2:
            Exercicio02.SomaNumeros();
        break;  
        case 3:
            Exercicio03.CompararValores();
            break;
        case 4:
        Exercicio04.Calculos();
            break;
        case 5:
            Exercicio05.TrocaDeValores();
            break;
        case 6:
            Exercicio06.CastTemperatura();
        break;
        case 7:
            Exercicio07.IntervaloDeValores();
        break;
        case 8:
            Exercicio08.ValidarNumeros();
        break;
        case 9:
            Exercicio09.ComparaçãoNumeros();
        break;
        case 10:
            Exercicio10.ImprimirValores();
        break;
        case 11:
            Exercicio11.ordenarNumeros();
            break;
        case 12:
            Exercicio12.EscolherMes();
            break;
        default:
            // Fecha o scanner 
            ScannerUtil.closeScanner();
            System.exit(0);
        }   
    }
}
