package br.edu.up.controller;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    // Método adicional para fechar o Scanner, se necessário
    public static void closeScanner() {
        scanner.close();
    }
}
