/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.MCadastroPessoa.controller;

import br.com.senactech.MCadastroPessoa.model.Pessoa;
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
public class CPessoaIT {
    
    public CPessoaIT() {
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
     * Test of getAll method, of class CPessoa.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CPessoa instance = new CPessoa();
        ArrayList<Pessoa> expResult = instance.getAll();
        ArrayList<Pessoa> result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of gerarId method, of class CPessoa.
     */
    @Test
    public void testGerarId() {
        System.out.println("gerarId");
        CPessoa instance = new CPessoa();
        int expResult = 1;
        int result = instance.gerarId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class CPessoa.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Pessoa p = null;
        CPessoa instance = new CPessoa();
        instance.add(p);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mokPessoas method, of class CPessoa.
     */
    @Test
    public void testMokPessoas() {
        System.out.println("mokPessoas");
        CPessoa instance = new CPessoa();
        instance.mokPessoas();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of verCPF method, of class CPessoa.
     */
    @Test
    public void testVerCPF() {
        System.out.println("verCPF");
        String cpf = "";
        CPessoa instance = new CPessoa();
        boolean expResult = false;
        boolean result = instance.verCPF(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of verStatusPes method, of class CPessoa.
     */
    @Test
    public void testVerStatusPes() {
        System.out.println("verStatusPes");
        String cpf = "";
        CPessoa instance = new CPessoa();
        boolean expResult = false;
        boolean result = instance.verStatusPes(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getByDoc method, of class CPessoa.
     */
    @Test
    public void testGetByDoc() {
        System.out.println("getByDoc");
        String cpf = "";
        CPessoa instance = new CPessoa();
        String expResult = cpf;
        String result = cpf;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alteraStatus method, of class CPessoa.
     */
    @Test
    public void testAlteraStatus() {
        System.out.println("alteraStatus");
        String cpf = "";
        int status = 0;
        CPessoa instance = new CPessoa();
        instance.alteraStatus(cpf, status);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deletar method, of class CPessoa.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        Pessoa p = null;
        CPessoa instance = new CPessoa();
        boolean expResult = false;
        boolean result = instance.deletar(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pesqIdPes method, of class CPessoa.
     */
    @Test
    public void testPesqIdPes() {
        System.out.println("pesqIdPes");
        String cpf = "";
        CPessoa instance = new CPessoa();
        int expResult = 0;
        int result = instance.pesqIdPes(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNomePes method, of class CPessoa.
     */
    @Test
    public void testGetNomePes() {
        System.out.println("getNomePes");
        int idPessoa = 1;
        CPessoa instance = new CPessoa();
        String expResult = null;
        String result = instance.getNomePes(idPessoa);
        assertEquals(expResult, result); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
