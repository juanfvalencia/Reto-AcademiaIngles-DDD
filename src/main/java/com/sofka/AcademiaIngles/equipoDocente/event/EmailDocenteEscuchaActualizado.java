package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscuchaId;
import com.sofka.AcademiaIngles.generics.Email;

public class EmailDocenteEscuchaActualizado extends DomainEvent {

    private final DocenteEscuchaId docenteEscuchaId;
    private final Email email;

    public EmailDocenteEscuchaActualizado(DocenteEscuchaId entityId, Email email){
        super("sofka.equipoDocente.emailDocenteEscuchaActualizado");
        this.docenteEscuchaId = entityId;
        this.email = email;
    }

    public DocenteEscuchaId getDocenteEscuchaId() {
        return docenteEscuchaId;
    }

    public Email getEmail() {
        return email;
    }
}
