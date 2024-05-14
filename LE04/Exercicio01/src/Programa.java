import java.util.Arrays;

import br.edu.up.models.Livro;

public class Programa {
     public static void main(String[] args) {
        // Livro 01
        Livro livro01 = new Livro();
        livro01.setCodigo("1598FHK");
        livro01.setTitulo("Core Java 2");
        livro01.setAutores(new String[]{"Cay S. Horstmann", "Gary Cornell"});
        livro01.setIsbn("0130819336");
        livro01.setAno(2005);

        // Livro 02
        Livro livro02 = new Livro();
        livro02.setCodigo("9865PLO");
        livro02.setTitulo("Java, Como programar");
        livro02.setAutores(new String[]{"Harvey Deitel"});
        livro02.setIsbn("0130341517");
        livro02.setAno(2015);

        // Apresentar os dados dos livros na tela
        System.out.println("Livro 01:");
        System.out.println("Código: " + livro01.getCodigo());
        System.out.println("Título: " + livro01.getTitulo());
        System.out.println("Autores: " + Arrays.toString(livro01.getAutores()));
        System.out.println("ISBN: " + livro01.getIsbn());
        System.out.println("Ano: " + livro01.getAno());

        System.out.println("\nLivro 02:");
        System.out.println("Código: " + livro02.getCodigo());
        System.out.println("Título: " + livro02.getTitulo());
        System.out.println("Autores: " + Arrays.toString(livro02.getAutores()));
        System.out.println("ISBN: " + livro02.getIsbn());
        System.out.println("Ano: " + livro02.getAno());
    }
}
