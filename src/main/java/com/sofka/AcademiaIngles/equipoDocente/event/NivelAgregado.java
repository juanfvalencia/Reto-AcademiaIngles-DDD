package com.sofka.AcademiaIngles.equipoDocente.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class NivelAgregado extends DomainEvent {

    private final NivelId nivelId;

    public NivelAgregado(NivelId nivelId){
        super("sofka.equipoDocente.nivelAgregado");
        this.nivelId = nivelId;
    }

    public NivelId getNivelId() {
        return nivelId;
    }
}
