package com.sofka.AcademiaIngles.nivel;

import co.com.sofka.domain.generic.Entity;
import com.sofka.AcademiaIngles.nivel.value.Contenido;
import com.sofka.AcademiaIngles.nivel.value.ModuloId;
import com.sofka.AcademiaIngles.nivel.value.Practica;
import com.sofka.AcademiaIngles.nivel.value.Tarea;

import java.util.Objects;

public class Modulo extends Entity<ModuloId> {

    protected Contenido contenido;
    protected Tarea tarea;
    protected Practica practica;

    public Modulo(ModuloId entityId, Contenido contenido, Tarea tarea, Practica practica) {
        super(entityId);
        this.contenido = Objects.requireNonNull(contenido);
        this.tarea = Objects.requireNonNull(tarea);
        this.practica = Objects.requireNonNull(practica);
    }

    public Contenido contenido(){
        return contenido;
    }

    public void actualizarContenido(Contenido contenido){
        Objects.requireNonNull(contenido);
        this.contenido = contenido;
    }

    public void actualizarTarea(Tarea tarea){
        Objects.requireNonNull(tarea);
        this.tarea = tarea;
    }

    public void actualizarPractica(Practica practica){
        Objects.requireNonNull(practica);
        this.practica = practica;
    }

    public Tarea tarea(){
        return tarea;
    }

    public Practica practica(){
        return practica;
    }
}
