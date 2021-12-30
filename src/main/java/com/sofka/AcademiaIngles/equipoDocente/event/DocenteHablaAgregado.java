package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteHablaId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

public class DocenteHablaAgregado extends DomainEvent {

    private final DocenteHablaId docenteHablaId;
    private final Nombre nombre;
    private final Email email;

    public DocenteHablaAgregado(DocenteHablaId entityId, Nombre nombre, Email email){
        super("sofka.equipoDocente.DocenteHablaAgregado");
        this.docenteHablaId = entityId;
        this.nombre = nombre;
        this.email = email;
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
