/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.MCadastroPessoa.controller;

import br.com.senactech.MCadastroPessoa.model.Carro;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author faria
 */
public class CCarroIT {
    
    public CCarroIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gerarId method, of class CCarro.
     */
    @Test
    public void testGerarId() {
        System.out.println("gerarId");
        CCarro instance = new CCarro();
        int expResult = 1;
        int result = instance.gerarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class CCarro.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CCarro instance = new CCarro();
        ArrayList<Carro> expResult = instance.getAll();
        ArrayList<Carro> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CCarro.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Carro c = null;
        CCarro instance = new CCarro();
        instance.add(c);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class CCarro.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        Carro c = null;
        CCarro instance = new CCarro();
        boolean expResult = false;
        boolean result = instance.deletar(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mokCarro method, of class CCarro.
     */
    @Test
    public void testMokCarro() {
        System.out.println("mokCarro");
        CCarro instance = new CCarro();
        instance.mokCarro();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verPlaca method, of class CCarro.
     */
    @Test
    public void testVerPlaca() {
        System.out.println("verPlaca");
        String placa = "";
        CCarro instance = new CCarro();
        boolean expResult = false;
        boolean result = instance.verPlaca(placa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verAnoMod method, of class CCarro.
     */
    @Test
    public void testVerAnoMod() {
        System.out.println("verAnoMod");
        int anoFab = 2000;
        int anoMod = 2000;
        CCarro instance = new CCarro();
        boolean expResult = true;
        boolean result = instance.verAnoMod(anoFab, anoMod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getByDoc method, of class CCarro.
     */
    @Test
    public void testGetByDoc() {
        System.out.println("getByDoc");
        String placa = "";
        CCarro instance = new CCarro();
        Carro expResult = null;
        Carro result = instance.getByDoc(placa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
