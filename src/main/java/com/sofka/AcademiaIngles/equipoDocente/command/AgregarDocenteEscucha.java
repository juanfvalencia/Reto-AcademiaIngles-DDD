package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscuchaId;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

public class AgregarDocenteEscucha extends Command {

    private final EquipoDocenteId equipoDocenteId;
    private final DocenteEscuchaId docenteEscuchaId;
    private final Nombre nombre;
    private final Email email;

    public AgregarDocenteEscucha(DocenteEscuchaId entityId, EquipoDocenteId equipoDocenteId, Nombre nombre, Email email) {
        this.docenteEscuchaId = entityId;
        this.equipoDocenteId = equipoDocenteId;
        this.nombre = nombre;
        this.email = email;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public DocenteEscuchaId getDocenteEscuchaId() {
        return docenteEscuchaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
