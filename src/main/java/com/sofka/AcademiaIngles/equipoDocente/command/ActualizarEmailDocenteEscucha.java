package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscuchaId;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.generics.Email;

public class ActualizarEmailDocenteEscucha extends Command {

    private final EquipoDocenteId equipoDocenteId;
    private final DocenteEscuchaId docenteEscuchaId;
    private final Email email;

    public ActualizarEmailDocenteEscucha(DocenteEscuchaId docenteEscuchaId, EquipoDocenteId entityId, Email email) {
        this.docenteEscuchaId = docenteEscuchaId;
        this.equipoDocenteId = entityId;
        this.email = email;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public DocenteEscuchaId getDocenteEscuchaId() {
        return docenteEscuchaId;
    }

    public Email getEmail() {
        return email;
    }
}
