package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscrituraId;
import com.sofka.AcademiaIngles.generics.Email;

public class EmailDocenteEscrituraActualizado extends DomainEvent {

    private final DocenteEscrituraId docenteEscrituraId;
    private final Email email;

    public EmailDocenteEscrituraActualizado(DocenteEscrituraId entityId, Email email){
        super("sofka.equipoDocente.emailDocenteEscrituraActualizado");
        this.docenteEscrituraId = entityId;
        this.email = email;
    }

    public DocenteEscrituraId getDocenteEscrituraId() {
        return docenteEscrituraId;
    }

    public Email getEmail() {
        return email;
    }
}
