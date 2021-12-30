package com.sofka.AcademiaIngles.nivel;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

public class Nivel extends AggregateEvent<NivelId> {

    protected Modulo modulo;
    protected Metodologia metodologia;
    protected Certificacion certificacion;

    public Nivel(NivelId entityId) {
        super(entityId);
    }

    public Modulo getModulo() {
        return modulo;
    }

    public Metodologia getMetodologia() {
        return metodologia;
    }

    public Certificacion getCertificacion() {
        return certificacion;
    }
}
