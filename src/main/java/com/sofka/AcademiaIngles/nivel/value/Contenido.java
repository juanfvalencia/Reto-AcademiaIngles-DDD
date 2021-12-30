package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contenido implements ValueObject<String> {

    private final String value;

    public Contenido(String value) {
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El contenido no puede estar vacío");
        }
        if(this.value.length()<100){
            throw new IllegalArgumentException("El contenido no puede tener menos de cien caracteres");
        }
        if(this.value.length()>2000){
            throw new IllegalArgumentException("El contenido no puede tener mas de dos mil caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contenido contenido = (Contenido) o;
        return Objects.equals(value, contenido.value);
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
