package com.sofka.AcademiaIngles.nivel.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PodCast implements ValueObject<String> {

    private final String value;

    public PodCast(String value) {
        this.value = value;
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El PodCast no puede estar vacío");
        }
        if(this.value.length()<5){
            throw new IllegalArgumentException("El nombre del PodCast no puede tener menos de cinco caracteres");
        }
        if(this.value.length()>20){
            throw new IllegalArgumentException("El PodCast no puede tener mas de veinte caracteres");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PodCast podCast = (PodCast) o;
        return Objects.equals(value, podCast.value);
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
