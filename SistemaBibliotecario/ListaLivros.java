package poo.SistemaBibliotecario;

import java.util.ArrayList;
import java.util.List;

public class ListaLivros {
    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<Livro>();

        Livro livro1 = new Livro("Estatistica Basica", "Editora Saraiva", "2002");
        Livro livro2 = new Livro("The GIS Guide", "ESRI Press", "2005");
        Livro livro3 = new Livro("Matematica no segundo grau", "Editora Nobel", "2002");

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        for (Livro l : livros) {
            System.out.println(l);
        }

    }

}