package com.sofka.AcademiaIngles.equipoDocente.value;

import co.com.sofka.domain.generic.ValueObject;

public class TipoEquipo implements ValueObject<TipoEquipo.Valor> {

    private final Valor value;

    public TipoEquipo(Valor value) {
        this.value = value;
    }

    public enum Valor {
        ESTUDIANTEMENORDEEDAD,
        ESTUDIANTEMAYORDEEDAD;
    }

    @Override
    public Valor value() {
        return value;
    }
}
