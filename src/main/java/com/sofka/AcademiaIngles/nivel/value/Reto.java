package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Reto implements ValueObject<String> {

    private final String value;

    public Reto(String value) {
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El Reto no puede estar vacío");
        }
        if(this.value.length()<20){
            throw new IllegalArgumentException("El Reto no puede tener menos de vainte caracteres");
        }
        if(this.value.length()>100){
            throw new IllegalArgumentException("La Reto no puede tener mas de cien caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reto reto = (Reto) o;
        return Objects.equals(value, reto.value);
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
