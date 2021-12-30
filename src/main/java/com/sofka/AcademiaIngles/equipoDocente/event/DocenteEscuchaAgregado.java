package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscrituraId;
import com.sofka.AcademiaIngles.equipoDocente.value.DocenteEscuchaId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;

public class DocenteEscuchaAgregado extends DomainEvent {

    private final DocenteEscuchaId docenteEscuchaId;
    private final Nombre nombre;
    private final Email email;

    public DocenteEscuchaAgregado(DocenteEscuchaId entityId, Nombre nombre, Email email){
        super("sofka.equipoDocente.DocenteEscuchaAgregado");
        this.docenteEscuchaId = entityId;
        this.nombre = nombre;
        this.email = email;
    }

    public DocenteEscuchaId getDocenteEscuchaId() {
        return docenteEscuchaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
