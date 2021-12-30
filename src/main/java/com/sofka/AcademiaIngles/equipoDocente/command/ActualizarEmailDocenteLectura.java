package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteHablaId;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteLecturaId;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.generics.Email;

public class ActualizarEmailDocenteLectura extends Command {

    private final EquipoDocenteId equipoDocenteId;
    private final DocenteLecturaId docenteLecturaId;
    private final Email email;

    public ActualizarEmailDocenteLectura(DocenteLecturaId entityId, EquipoDocenteId equipoDocenteId, Email email) {
        this.docenteLecturaId = entityId;
        this.equipoDocenteId = equipoDocenteId;
        this.email = email;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public DocenteLecturaId getDocenteLecturaId() {
        return docenteLecturaId;
    }

    public Email getEmail() {
        return email;
    }
}
