
package Questao_01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeferson Bonecher
 */
public class MainIT {
    
    public MainIT() {
    }
    
   Main main = new Main();
   
    @Test
    public void testMediana() {
    int [] numeros = {9, 2, 1, 4, 6};  
        assertEquals(Integer.toString(4), Main.mediana(numeros));
     
    }
    
    
      @Test
    public void testMediana1() {
    int [] numeros = {9, 2, 1, 4}; 
        assertEquals("Quantidade de numeros informados devem ser impar",Main.mediana(numeros));
     
    }

  

   

  
    
}
