package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteHablaId;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.generics.Email;

public class ActualizarEmailDocenteHabla extends Command {

    private final EquipoDocenteId equipoDocenteId;
    private final DocenteHablaId docenteHablaId;
    private final Email email;

    public ActualizarEmailDocenteHabla(DocenteHablaId docenteHablaId, EquipoDocenteId entityId, Email email) {
        this.docenteHablaId = docenteHablaId;
        this.equipoDocenteId = entityId;
        this.email = email;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public DocenteHablaId getDocenteHablaId() {
        return docenteHablaId;
    }

    public Email getEmail() {
        return email;
    }
}
