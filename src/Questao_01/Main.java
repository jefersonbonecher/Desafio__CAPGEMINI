package Questao_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jeferson Bonecher
 */
public class Main {

    /**
     * Metodo utilizado para calcular o valor mediano que esta em uma lista
     *
     * @param numeros É uma lista de numeros informada pelo usuário
     * @return retorna o valor mediano da lista ou uma mensagen que a quantidade
     * de numeros é par.
     */
    public static String mediana(int[] numeros) {
        int resultado = 0;
        // cria uma lista de inteiros 
        List<Integer> listaNumeros = new ArrayList<>();

        // adiciona os numeros na lista 
        for (int Numero : numeros) {
            listaNumeros.add(Numero);
        }
        // biblioteca utilizada para ordenar os numeros em orden crescente 
        Collections.sort(listaNumeros);

        //verica se o numero é impar e faz as osperações matematicas retornando a posição mediana da lista 
        if (listaNumeros.size() % 2 != 0) {
            int posicaoNumero = ((listaNumeros.size() + 1) / 2) - 1;
            resultado = listaNumeros.get(posicaoNumero);

        } else {
            // se o numero for par retorna uma mensagem 
                return ("Quantidade de numeros informados devem ser impar");
        }
        //transformando um inteiro em uma String 
        return Integer.toString(resultado);

    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 14, 15, 26, 17, 5};

        System.out.println(mediana(arr));
    }

}
