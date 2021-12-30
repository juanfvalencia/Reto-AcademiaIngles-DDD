package com.sofka.AcademiaIngles.estudiante;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.estudiante.event.*;
import com.sofka.AcademiaIngles.estudiante.value.*;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

import java.util.List;
import java.util.Objects;


public class Estudiante extends AggregateEvent<EstudianteId> {

    protected NivelId nivelId;
    protected Nombre nombre;
    protected Email email;
    protected ClasePresencial clasePresencial;
    protected ClaseVirtual claseVirtual;


    public Estudiante(EstudianteId entityId, NivelId nivelId, Nombre nombre, Email email) {
        super(entityId);
        this.nivelId = nivelId;
        this.nombre = nombre;
        this.email = email;
        appendChange(new EstudianteCreado(entityId, nivelId, nombre, email)).apply();
    }

    private Estudiante(EstudianteId estudianteId){
        super(estudianteId);
        subscribe(new EstudianteChange(this));
    }

    public static Estudiante from(EstudianteId estudianteId, List<DomainEvent> events){
        var estudiante = new Estudiante(estudianteId);
        events.forEach(estudiante::applyEvent);
        return estudiante;
    }

    public void agregarClasePresencial(Sede sede, Fecha fecha, Horario horario) {
        var id = new ClasePresencialId();
        Objects.requireNonNull(sede);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(horario);
        appendChange(new ClasePresencialAgregada(id, sede, fecha, horario)).apply();
    }

    public void agregarClaseVirtual(Horario horario){
        var id = new ClaseVirtualId();
        Objects.requireNonNull(horario);
        appendChange(new ClaseVirtualAgregada(id,horario)).apply();
    }

    public void actualizarSedeClasePresencial(Sede sede){
        var id = new ClasePresencialId();
        Objects.requireNonNull(sede);
        appendChange(new SedeClasePresencialActualizada(id, sede)).apply();
    }

    public void actualizarFechaClasePresencial(Fecha fecha){
        var id = new ClasePresencialId();
        Objects.requireNonNull(fecha);
        appendChange(new FechaClasePresencialActualizada(id, fecha)).apply();
    }

    public void actualizarHorarioClasePresencial(Horario horario){
        var id = new ClasePresencialId();
        Objects.requireNonNull(horario);
        appendChange(new HorarioClasePresencialActualizado(id, horario)).apply();
    }

    public void actualizarHorarioClaseVirtual(Horario horario){
        var id = new ClaseVirtualId();
        Objects.requireNonNull(horario);
        appendChange(new HorarioClaseVirtualActualizado(id, horario)).apply();
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

    public ClasePresencial clasePresencial(){
        return clasePresencial;
    }

    public ClaseVirtual claseVirtual(){
        return claseVirtual;
    }

}
