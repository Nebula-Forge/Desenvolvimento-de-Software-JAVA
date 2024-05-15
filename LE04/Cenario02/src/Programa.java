import br.edu.up.Ponto;

public class Programa {
    public static void main(String[] args) throws Exception {
        System.out.println("Cenario02\n");

        Ponto ponto1 = new Ponto();
        System.out.println("Ponto1 (" + ponto1.getX() + "," + ponto1.getY() + ")");

        Ponto ponto2 = new Ponto(3, 4);
        System.out.println("Ponto2 (" + ponto2.getX() + "," + ponto2.getY() + ")");

        System.out.println("Distancia entre ponto1 e ponto2: " + ponto1.calcularDistancia(ponto2));

        System.out.println("Distancia entre ponto2 e (7, 2): " + ponto2.calcularDistancia(7, 2));

        ponto1.setX(10);

        ponto1.setY(3);

        System.out.println("Novos valores do ponto1 (" + ponto1.getX() + "," + ponto1.getY() + ")");
    }
}
