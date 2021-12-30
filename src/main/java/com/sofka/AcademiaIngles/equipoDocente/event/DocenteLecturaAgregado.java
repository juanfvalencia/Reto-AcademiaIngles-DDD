package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteHablaId;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteLecturaId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

public class DocenteLecturaAgregado extends DomainEvent {

    private final DocenteLecturaId docenteLecturaId;
    private final Nombre nombre;
    private final Email email;

    public DocenteLecturaAgregado(DocenteLecturaId entityId, Nombre nombre, Email email){
        super("sofka.equipoDocente.DocenteLecturaAgregado");
        this.docenteLecturaId = entityId;
        this.nombre = nombre;
        this.email = email;
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
