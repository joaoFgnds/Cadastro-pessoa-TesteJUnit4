/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.MCadastroPessoa.controller;

import br.com.senactech.MCadastroPessoa.model.VagaEstacionamento;
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
public class CVagaEstacionamentoIT {
    
    public CVagaEstacionamentoIT() {
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
     * Test of add method, of class CVagaEstacionamento.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        VagaEstacionamento o = null;
        CVagaEstacionamento instance = new CVagaEstacionamento();
        instance.add(o);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class CVagaEstacionamento.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CVagaEstacionamento instance = new CVagaEstacionamento();
        ArrayList<VagaEstacionamento> expResult = instance.getAll();
        ArrayList<VagaEstacionamento> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class CVagaEstacionamento.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        VagaEstacionamento o = null;
        CVagaEstacionamento instance = new CVagaEstacionamento();
        boolean expResult = false;
        boolean result = instance.deletar(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getByDoc method, of class CVagaEstacionamento.
     */
    @Test
    public void testGetByDoc() {
        System.out.println("getByDoc");
        String d = "";
        CVagaEstacionamento instance = new CVagaEstacionamento();
        VagaEstacionamento expResult = null;
        VagaEstacionamento result = instance.getByDoc(d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gerarId method, of class CVagaEstacionamento.
     */
    @Test
    public void testGerarId() {
        System.out.println("gerarId");
        CVagaEstacionamento instance = new CVagaEstacionamento();
        int expResult = 1;
        int result = instance.gerarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mokVagas method, of class CVagaEstacionamento.
     */
    @Test
    public void testMokVagas() {
        System.out.println("mokVagas");
        CVagaEstacionamento instance = new CVagaEstacionamento();
        instance.mokVagas();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
