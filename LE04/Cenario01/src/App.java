import br.edu.up.Livro;
public class App {
    public static void main(String[] args) {

        // Criando instâncias dos livros

        Livro livro1 = new Livro("1598FHK", "Core Java 2", new String[]{"Cay S. Horstmann", "Gary Cornell"}, "0130819336", 2005);
        Livro livro2 = new Livro("9865PLO", "Java, Como Programar", new String[]{"Harvey Deitel"}, "0130341517", 2015);

        System.out.println("Livro 01:");
        System.out.println("Codigo: " + livro1.getCodigo());
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autores:");
        for (String autor : livro1.getAutores()) {
            System.out.println(autor);
        }
        System.out.println("ISBN: " + livro1.getIsbn()); 
        System.out.println("Ano: " + livro1.getAno()); 

        System.out.println("\nLivro 02:");
        System.out.println("Codigo: " + livro2.getCodigo()); 
        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autores:");
        for (String autor : livro2.getAutores()) {
            System.out.println(autor);
        }
        System.out.println("ISBN: " + livro2.getIsbn());
        System.out.println("Ano: " + livro2.getAno());
    }
}
