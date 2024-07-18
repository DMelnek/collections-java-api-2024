package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    //Atributos
    private List<Livro> livroList;

    public CatalogoLivro() { this.livroList = new ArrayList<>(); }


    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {

        for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
    }
    return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAno.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAno;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }

            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivro.adicionarLivro("Livro 1", "Autor 2", 2022);
        catalogoLivro.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivro.adicionarLivro("Livro 4", "Autor 1", 2024);

        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2019, 2022));
        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 1"));

    }
}

