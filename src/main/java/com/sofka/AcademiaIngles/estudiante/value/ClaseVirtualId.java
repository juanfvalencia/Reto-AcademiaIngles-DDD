package com.sofka.AcademiaIngles.estudiante.value;

import co.com.sofka.domain.generic.Identity;

public class ClaseVirtualId extends Identity {

    public ClaseVirtualId(){
    }

    public ClaseVirtualId(String id){
        super(id);
    }

    public static ClaseVirtualId of(String id){
        return new ClaseVirtualId(id);
    }
}
