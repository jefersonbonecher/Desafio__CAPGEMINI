
package Questao_03;

import java.util.Scanner;

/**
 *
 * @author Jeferson Bonecher
 */
public class Main {
    
    
    
    
        /**
         * Metodo utilizado para encriptar a mensagem digitada pelo usuário.
         * @param texto recebe a mensagem digitada pelo usuário. 
         * @return retorna o texto encriptado
         */
        public static String encriptar(String texto){
            // crinado uma String auxiliar para tirar os espaços da mensagem          
            String aux = texto.replace(" ", "");
            // transformando a mensagem em um array 
            String arrayTexto [] = aux.split("");
            //fazendo a raiz quadrada da qunatidade de caracteres 
            int raiz = (int) Math.ceil(Math.sqrt(aux.length()));
            
            // criando um vetor bidimencional 
            String grid [][] = new String [raiz][raiz];
            int contador=0;
            //fazendo dois for para percores os dois vetores 
            for (String[] grid1 : grid) {
                for (int j = 0; j < grid.length; j++) {
                    //comparando a variavel contador é menos que o tamanho do arrayTexto
                    if (contador<arrayTexto.length) {
                        //adicionando o valor armazendo do arrayTexto nos vetores 
                        grid1[j] = arrayTexto[contador];
                        //incrementando o contador 
                        contador++;
                    }
                }
            }
            //criando uma string para armazenar o texto encriptado 
            String encritado ="";
            //fazendo dois for para percores os dois vetores
            for (int i = 0; i < grid.length; i++) {
                for (String[] grid1 : grid) {
                    //verificando se a posição dos vetores não é nula 
                    if (grid1[i] != null) {
                        //adicionado os caracteres obtidos das posições dos vetores na variavel. 
                        encritado += grid1[i];
                    }
                }
                 encritado += " ";
     
            
        }
        // retorna o texto encriptado 
        return encritado;
        }
        
        public static void main(String[] args){
            
             Scanner sc = new Scanner(System.in);

        System.out.print("Digite a mensagem que deve ser encriptada: ");
        String texto = encriptar(sc.nextLine());

        System.out.println(Main.encriptar(texto));

     
        }
    
            
}
