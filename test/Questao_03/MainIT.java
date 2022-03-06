/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao_03;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class MainIT {
    
   Main main = new Main();
   
    @Test
    public void testMain() {
              
        String texto = ("tenha um bom dia");
        
        String aux = texto.replace(" ", "");
        
        int raiz = (int) Math.ceil(Math.sqrt(aux.length()));
        
        assertEquals(13,aux.length());
       
        assertEquals(4, raiz);
        
        assertEquals("taoa eum nmd hbi" ,texto);
    }
    
}
