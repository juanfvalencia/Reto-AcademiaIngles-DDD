package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteLecturaId;
import com.sofka.AcademiaIngles.generics.Email;

public class EmailDocenteLecturaActualizado extends DomainEvent {

    private final DocenteLecturaId docenteLecturaId;
    private final Email email;

    public EmailDocenteLecturaActualizado(DocenteLecturaId entityId, Email email){
        super("sofka.equipoDocente.emailDocenteLecturaActualizado");
        this.docenteLecturaId = entityId;
        this.email = email;
    }

    public DocenteLecturaId getDocenteLecturaId() {
        return docenteLecturaId;
    }

    public Email getEmail() {
        return email;
    }
}
