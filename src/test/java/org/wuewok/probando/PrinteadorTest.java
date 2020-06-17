package org.wuewok.probando;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PrinteadorTest {

    Printeador printeador;

    @Before
    public void before() {
        printeador = new Printeador();
    }

    @Test
    public void saludarRaul() {
        String saludo = this.printeador.saludar("Raul");
        assertEquals(saludo, "Hola Raul");
    }

    @Test
    public void saludarAnonimo() {
        String saludo = this.printeador.saludar();
        assertEquals(saludo, "Hola usuario");
    }
}