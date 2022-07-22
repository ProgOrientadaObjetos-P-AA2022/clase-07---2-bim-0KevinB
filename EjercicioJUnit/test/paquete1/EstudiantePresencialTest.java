/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UTPL
 */
public class EstudiantePresencialTest {

    EstudiantePresencial instance;

    public EstudiantePresencialTest() {
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
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerNumeroCreditos() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("establecerNumeroCreditos");
        int numero = 10;
        instance = new EstudiantePresencial();
        instance.establecerNumeroCreditos(numero);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");

        assertEquals(field.get(instance), 10);

        // TODO review the generated test code and remove the default call to fail.
        //    fail("The test case is a prototype.");
    }

    /**
     * Test of establecerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testEstablecerCostoCredito() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        System.out.println("establecerCostoCredito");
        double valor = 1.0;
        instance = new EstudiantePresencial();
        instance.establecerCostoCredito(valor);
        Field field = instance.getClass().getDeclaredField("costoCredito");
        field.setAccessible(true);
        assertEquals(field.get(instance), 1.0);
        // TODO review the generated test code and remove the default call to fail.
        //   fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMatriculaPresencial method, of class
     * EstudiantePresencial.
     */
    @Test
    public void testCalcularMatriculaPresencial() throws
            IllegalArgumentException,
            NoSuchFieldException,
            IllegalAccessException {
        System.out.println("calcularMatriculaPresencial");
        instance = new EstudiantePresencial();
        instance.establecerCostoCredito(10);
        instance.establecerNumeroCreditos(1);
        instance.calcularMatriculaPresencial();
        Field field = instance.getClass().getDeclaredField("matriculaPresencial");
        field.setAccessible(true);
        assertEquals(field.get(instance), 10.0);
        // TODO review the generated test code and remove the default call to fail.
        //   fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");
        instance = new EstudiantePresencial();
        instance.establecerNumeroCreditos(10);
        int expResult = 10;
        int result = instance.obtenerNumeroCreditos();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");
        instance = new EstudiantePresencial();
        instance.establecerCostoCredito(2);
        double expResult = instance.obtenerCostoCredito();
        double result = instance.obtenerCostoCredito();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //   fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaPresencial");
        instance = new EstudiantePresencial();
        instance.establecerNumeroCreditos(1);
        instance.establecerCostoCredito(10);
        instance.calcularMatriculaPresencial();
        double expResult = 10.0;
        double result = instance.obtenerMatriculaPresencial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

}
