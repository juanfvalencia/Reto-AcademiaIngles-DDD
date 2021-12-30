package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Practica implements ValueObject<String> {

    private final String value;

    public Practica(String value) {
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("La Practica no puede estar vacía");
        }
        if(this.value.length()<20){
            throw new IllegalArgumentException("La Practica no debe tener menos de vainte caracteres");
        }
        if(this.value.length()>100){
            throw new IllegalArgumentException("La Practica no puede tener mas de cien caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Practica practica = (Practica) o;
        return Objects.equals(value, practica.value);
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
