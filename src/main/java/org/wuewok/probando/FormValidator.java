package org.wuewok.probando;

import org.apache.commons.lang3.StringUtils;

/*
Suponiendo que hay un formulario con los siguientes datos:
- Tipo de persona (obligatorio)
- Nombre (obligatorio si es persona fisica)
- Apellido (obligatorio si es persona fisica)
- Razon social (obligatorio si es persona juridica)
- Telefono (opcional)
- Direccion (opcional)
- DNI (opcional, solo si es persona fisica)
- CUIL (opcional, solo si es persona juridica)
*/

public class FormValidator {

    public boolean validar(FormData data) {

        if (data == null || data.tipoPersona == null) {
            return false;
        }

        if (data.tipoPersona == TipoPersona.FISICA) {
            return this.validarFisica(data);
        }
        else {
            return this.validarJuridica(data);
        }
    }

    private boolean validarFisica(FormData data) {
        if (StringUtils.isEmpty(data.nombre)) {
            return false;
        }

        if (StringUtils.isEmpty(data.apellido)) {
            return false;
        }

        if (StringUtils.isEmpty(data.dni)) {
            return false;
        }

        return true;
    }

    private boolean validarJuridica(FormData data) {
        if (StringUtils.isEmpty(data.razonSocial)) {
            return false;
        }

        if (StringUtils.isEmpty(data.cuil)) {
            return false;
        }

        if (StringUtils.isEmpty(data.direccion)) {
            return false;
        }

        if (StringUtils.isEmpty(data.telefono)) {
            return false;
        }
        return true;
    }
}