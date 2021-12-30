package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscrituraId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

public class DocenteEscrituraAgregado extends DomainEvent {

    private final DocenteEscrituraId docenteEscrituraId;
    private final Nombre nombre;
    private final Email email;

    public DocenteEscrituraAgregado(DocenteEscrituraId entityId, Nombre nombre, Email email){
        super("sofka.equipoDocente.DocenteEscrituraAgregado");
        this.docenteEscrituraId = entityId;
        this.nombre = nombre;
        this.email = email;
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
