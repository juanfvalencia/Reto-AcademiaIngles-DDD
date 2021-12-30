package com.sofka.AcademiaIngles.estudiante.value;

import co.com.sofka.domain.generic.Identity;

public class ClaseVirtualPorDiaId extends Identity {

    public ClaseVirtualPorDiaId(){
    }

    public ClaseVirtualPorDiaId(String id){
        super(id);
    }

    public static ClaseVirtualPorDiaId of(String id){
        return new ClaseVirtualPorDiaId(id);
    }
}
