package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Puntaje implements ValueObject<String> {

    private final String value;

    public Puntaje(String value) {
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El Puntaje no puede estar vacío");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puntaje puntaje = (Puntaje) o;
        return Objects.equals(value, puntaje.value);
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
