/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao_02;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class MainIT {
    
    public MainIT() {
    }
    Main main = new Main();
    
    
    
    @Test
    public void testPares() {
     int numero = 2;
        int[] vetor = {1,5,3,4,2};
        assertEquals(3, Main.pares(vetor, numero));
     
    }
    
    @Test
    public void testPares1() {
     int numero = 3;
        int[] vetor = {1,5,3,4,2};
        assertEquals(2, Main.pares(vetor, numero));
     
    }
    
      @Test
    public void testParesSemPares() {
     int x = 2;
        int[] vetor = {1,8,13,4,12};
        assertEquals(0, Main.pares(vetor, x));
     
    }

    
    
}
