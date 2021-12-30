package com.sofka.AcademiaIngles.equipoDocente.command;

import co.com.sofka.domain.generic.Command;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteLecturaId;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

public class AgregarDocenteLectura extends Command {

    private final EquipoDocenteId equipoDocenteId;
    private final DocenteLecturaId docenteLecturaId;
    private final Nombre nombre;
    private final Email email;

    public AgregarDocenteLectura(DocenteLecturaId entityId, EquipoDocenteId equipoDocenteId, Nombre nombre, Email email) {
        this.docenteLecturaId = entityId;
        this.equipoDocenteId = equipoDocenteId;
        this.nombre = nombre;
        this.email = email;
    }

    public EquipoDocenteId getEquipoDocenteId() {
        return equipoDocenteId;
    }

    public DocenteLecturaId getDocenteLecturaId() {
        return docenteLecturaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
