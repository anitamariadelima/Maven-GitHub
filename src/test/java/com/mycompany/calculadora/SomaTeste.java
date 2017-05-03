package com.mycompany.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anita
 */
public class SomaTeste {
    Soma soma = new Soma();
    
    @Test
        public void testarSoma() {
        
      assertEquals(1.0, soma.somar(2.0, -1.0), 0.1);
              
    }
        public void testarSoma2(){
      
        assertEquals(2.0, soma.somar(1.0, 1.0), 0.1);  
    }
    
        public void testarSoma3(){
      
        assertEquals(4.0, soma.somar(2.0, 2.0), 0.1);
    }
}
