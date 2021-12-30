package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Tarea implements ValueObject<String> {

    private final String value;

    public Tarea(String value) {
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Tarea no puede estar vacía");
        }
        if(this.value.length()<30){
            throw new IllegalArgumentException("La Tarea no puede tener menos de treinta caracteres");
        }
        if(this.value.length()>100){
            throw new IllegalArgumentException("La Tarea no puede tener mas de cien caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return Objects.equals(value, tarea.value);
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
