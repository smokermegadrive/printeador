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
}