package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * test
     */
    @Test
    public void testFibn(){
        assertEquals(55, App.fibn(10));
        assertEquals(1,App.fibn(1));
        assertEquals(0,App.fibn(0));
        assertEquals(89,App.fibn(11));
        
    }
}
