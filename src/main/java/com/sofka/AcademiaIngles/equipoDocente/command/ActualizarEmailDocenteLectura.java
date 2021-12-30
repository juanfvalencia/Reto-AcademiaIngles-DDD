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

    public ActualizarEmailDocenteLectura(DocenteLecturaId docenteLecturaId, EquipoDocenteId entityId, Email email) {
        this.docenteLecturaId = docenteLecturaId;
        this.equipoDocenteId = entityId;
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
