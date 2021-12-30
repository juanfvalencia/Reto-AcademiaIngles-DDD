package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteHablaId;
import com.sofka.AcademiaIngles.generics.Email;

public class EmailDocenteHablaActualizado extends DomainEvent {

    private final DocenteHablaId docenteHablaId;
    private final Email email;

    public EmailDocenteHablaActualizado(DocenteHablaId entityId, Email email){
        super("sofka.equipoDocente.emailDocenteHablaActualizado");
        this.docenteHablaId = entityId;
        this.email = email;
    }

    public DocenteHablaId getDocenteHablaId() {
        return docenteHablaId;
    }

    public Email getEmail() {
        return email;
    }
}
