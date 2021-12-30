package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscrituraId;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.generics.Email;

public class ActualizarEmailDocenteEscritura extends Command {

    private final EquipoDocenteId equipoDocenteId;
    private final DocenteEscrituraId docenteEscrituraId;
    private final Email email;

    public ActualizarEmailDocenteEscritura(DocenteEscrituraId entityId, EquipoDocenteId equipoDocenteId, Email email) {
        this.docenteEscrituraId = entityId;
        this.equipoDocenteId = equipoDocenteId;
        this.email = email;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public DocenteEscrituraId getDocenteEscrituraId() {
        return docenteEscrituraId;
    }

    public Email getEmail() {
        return email;
    }
}
