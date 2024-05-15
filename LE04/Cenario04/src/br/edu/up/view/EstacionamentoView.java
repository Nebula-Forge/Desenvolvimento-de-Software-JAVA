package br.edu.up.view;

public class EstacionamentoView {
    public void imprimirRelatorio(int totalEntradas, int totalSaidas, double pagamento) {
        System.out.println("Relatório:");
        System.out.println("Total de veículos que entraram: " + totalEntradas);
        System.out.println("Total de veículos que saíram: " + totalSaidas);
        System.out.println("Valor total de pagamentos: R$ " + pagamento);
    }
}
