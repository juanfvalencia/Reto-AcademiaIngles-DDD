package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Evaluacion implements ValueObject<String> {

    private final String value;

    public Evaluacion(String value) {
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Evaluacion no puede estar vacía");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evaluacion that = (Evaluacion) o;
        return Objects.equals(value, that.value);
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
