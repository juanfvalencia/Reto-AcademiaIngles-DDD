package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscrituraId;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

public class AgregarDocenteEscritura extends Command {

    private final EquipoDocenteId equipoDocenteId;
    private final DocenteEscrituraId docenteEscrituraId;
    private final Nombre nombre;
    private final Email email;

    public AgregarDocenteEscritura(DocenteEscrituraId entityId, EquipoDocenteId equipoDocenteId, Nombre nombre, Email email) {
        this.docenteEscrituraId = entityId;
        this.equipoDocenteId = equipoDocenteId;
        this.nombre = nombre;
        this.email = email;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public DocenteEscrituraId getDocenteEscrituraId() {
        return docenteEscrituraId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
