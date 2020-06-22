package org.wuewok.probando;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FormValidatorTest {
    FormValidator validator;

    @Before
    public void before() {
        this.validator = new FormValidator();
    }

    @Test
    public void personaJuridicaCompleta() {
        FormData data = new FormData();
        data.tipoPersona = TipoPersona.JURIDICA;
        data.razonSocial = "Pochoclera SRL";
        data.telefono = "2262";
        data.direccion = "al fondo a la derecha";
        data.cuil = "123";

        boolean isValid = this.validator.validar(data);
        assertTrue(isValid);
    }

    public void personaJuridicaDireccion() {
        FormData data = new FormData();
        data.tipoPersona = TipoPersona.JuridicaDireccion;
        data.razonSocial = "Pochoclera SRL";
        data.direccion = "al fondo a la derecha";
        data.cuil = "123";

        boolean isValid = this.validator.validar(data);
        assertTrue(isValid);
    }

    @Test
    public void personaJuridicaSinRazonSocial() {
        FormData data = new FormData();
        data.tipoPersona = TipoPersona.JuridicaSinRazon;
        data.telefono = "2262";
        data.direccion = "al fondo a la derecha";
        data.cuil = "123";

        boolean isValid = this.validator.validar(data);
        assertTrue(isValid);
    }

    @Test
    public void personaFisica() {
        FormData data = new FormData();
        data.tipoPersona = TipoPersona.FISICA;
        data.nombre = "Michael";
        data.apellido = "Vino";
        data.dni = "12345678";

        boolean isValid = this.validator.validar(data);
        assertTrue(isValid);
    }

    @Test
    public void personaFisicaSinNombre() {
        FormData data = new FormData();
        data.tipoPersona = TipoPersona.FisicaSinNombre;
        data.apellido = "Vino";
        data.dni = "12345678";

        boolean isValid = this.validator.validar(data);
        assertTrue(isValid);
    }

    @Test
    public void personaFisicaDNIVacio() {
        FormData data = new FormData();
        data.tipoPersona = TipoPersona.FisicaDNIVacio;
        data.nombre = "Michael";
        data.apellido = "Vino";
        data.dni = "";

        boolean isValid = this.validator.validar(data);
        assertTrue(isValid);
    }
}