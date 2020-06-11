package org.wuewok.probando;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrinteadorTest {

	@Test
	public void saludarRaul() {
		Printeador printeador = new Printeador();
		String saludo = printeador.saludar("Raul");
		assertEquals(saludo, "Hola Raul");
	}

}