package com.sofka.AcademiaIngles.estudiante;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.AcademiaIngles.estudiante.value.EstudianteId;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;
import com.sofka.AcademiaIngles.nivel.value.NivelId;


public class Estudiante extends AggregateEvent<EstudianteId> {

    protected NivelId nivelId;
    protected Nombre nombre;
    protected Email email;
    protected ClasePresencialPorDia clasePresencialPorDia;
    protected ClaseVirtualPorDia claseVirtualPorDia;


    public Estudiante(EstudianteId entityId, NivelId nivelId, Nombre nombre, Email email) {
        super(entityId);
        this.nivelId = nivelId;
        this.nombre = nombre;
        this.email = email;
    }

    public NivelId nivelId(){
        return nivelId;
    }

    public Nombre nombre(){
        return nombre;
    }

    public Email email(){
        return email;
    }

    public ClasePresencialPorDia clasePresencialPorDia(){
        return clasePresencialPorDia;
    }

    public ClaseVirtualPorDia claseVirtualPorDia(){
        return claseVirtualPorDia;
    }

}
