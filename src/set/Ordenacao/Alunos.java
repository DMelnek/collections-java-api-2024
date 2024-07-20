package set.Ordenacao;

import java.util.Comparator;

public class Alunos {
    //Atributos
    private String nome;
    private long matricula;
    private double nota;

    public Alunos(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota=" + nota +
                '}';
    }
}

class CompararPorNota implements Comparator<Alunos> {

    @Override
    public int compare(Alunos n1, Alunos n2) {
        return Double.compare(n1.getNota(), n2.getNota());
    }

}
