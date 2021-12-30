package com.sofka.AcademiaIngles.nivel.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.nivel.value.ClaseEnVivo;
import com.sofka.AcademiaIngles.nivel.value.MetodologiaId;

public class ClaseEnVivoMetodologiaActualizada extends DomainEvent {

    private final MetodologiaId metodologiaId;
    private final ClaseEnVivo claseEnVivo;

    public ClaseEnVivoMetodologiaActualizada(MetodologiaId entityId, ClaseEnVivo claseEnVivo){
        super("sofka.nivel.claseEnVivoMetodologiaActualizada");
        this.metodologiaId = entityId;
        this.claseEnVivo = claseEnVivo;
    }

    public MetodologiaId getMetodologiaId() {
        return metodologiaId;
    }

    public ClaseEnVivo getClaseEnVivo() {
        return claseEnVivo;
    }
}
