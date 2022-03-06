package Questao_02;

/**
 *
 * @author Jeferson Bonecher
 */
public class Main {

    /**
     * Medoto utilizado para determinar o número de elementos pares do vetor que
     * tem uma diferença igual ao valor de x.
     *
     * @param vetor vetor de numeros inteiros determinado pelo usuário
     * @param x valor da diferença dos numeros do vetor
     * @return retorna a quantidade de pares com valor diferença de valor igual
     * o x.
     */
    public static int pares(int[] vetor, int x) {
        int contador = 0;
        String str = null;
        // os 2 for fazem um vetor percorer o outro
        for (int i : vetor) {
            for (int j : vetor) {
                //comparando se o valor de i menos o valor de j é igual a 2 se for acresenta mais 1 na variavel contador 
                if (i - j == x) {
                    contador++;
                    str = +i + "," + j;
                    System.out.println(str);

                }

            }

        }
      
        //retornando a quantidade de pares 
        return contador;

    }

    public static void main(String[] args) {

        int x = 3;
        int[] vetor = {1, 5, 3, 4, 2};

        System.out.println(pares(vetor, x));

    }

}
