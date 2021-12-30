package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteHablaId;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

public class AgregarDocenteHabla extends Command {

    private final EquipoDocenteId equipoDocenteId;
    private final DocenteHablaId docenteHablaId;
    private final Nombre nombre;
    private final Email email;

    public AgregarDocenteHabla(DocenteHablaId entityId, EquipoDocenteId equipoDocenteId, Nombre nombre, Email email) {
        this.docenteHablaId = entityId;
        this.equipoDocenteId = equipoDocenteId;
        this.nombre = nombre;
        this.email = email;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public DocenteHablaId getDocenteHablaId() {
        return docenteHablaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
