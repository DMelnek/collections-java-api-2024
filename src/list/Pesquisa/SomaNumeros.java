package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributos
    private List<Integer> numeros;

    //construtor

    public SomaNumeros() {
        this.numeros = new ArrayList<>();

    }
    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }
    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeros)
            soma += numero;
        return soma;
    }
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for(Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        }else {
           throw new RuntimeException("A lista está vazia!");
        }
    }
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= numero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        }else {
            throw new RuntimeException("A lista está vazia!");

        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        //criar instância
        SomaNumeros somaNumeros = new SomaNumeros();

        //adicionar numeros
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(69);
        somaNumeros.adicionarNumero(34);

        System.out.println("Numeros Adicionados");
        somaNumeros.exibirNumeros();

        System.out.printf("Soma números: " + somaNumeros.calcularSoma());

        System.out.println("Maior Numero: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor Numero: " + somaNumeros.encontrarMenorNumero());

    }
}
