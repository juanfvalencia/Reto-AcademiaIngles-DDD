package com.sofka.AcademiaIngles.estudiante.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Sede implements ValueObject<String> {

    private final String value;

    public Sede(String value) {
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Sede no puede estar vacía ");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sede sede = (Sede) o;
        return Objects.equals(value, sede.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String value(){
        return value;
    }
}
