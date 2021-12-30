package com.sofka.AcademiaIngles.equipoDocente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.AcademiaIngles.equipoDocente.event.*;
import com.sofka.AcademiaIngles.equipoDocente.value.*;
import com.sofka.AcademiaIngles.generics.Email;
import com.sofka.AcademiaIngles.generics.Nombre;
import com.sofka.AcademiaIngles.nivel.value.NivelId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class EquipoDocente extends AggregateEvent<EquipoDocenteId> {

    protected Set<NivelId> niveles;
    protected DocenteEscritura docenteEscritura;
    protected DocenteEscucha docenteEscucha;
    protected DocenteHabla docenteHabla;
    protected DocenteLectura docenteLectura;
    protected TipoEquipo tipoEquipo;

    public EquipoDocente(EquipoDocenteId entityId, TipoEquipo tipoEquipo) {
        super(entityId);
        appendChange(new EquipoDocenteCreado(entityId, tipoEquipo)).apply();
    }

    private EquipoDocente(EquipoDocenteId equipoDocenteId){
        super(equipoDocenteId);
        subscribe(new EquipoDocenteChange(this));
    }

    public static EquipoDocente from(EquipoDocenteId entityId, List<DomainEvent> events){
        var equipoDocente = new EquipoDocente(entityId);
        events.forEach(equipoDocente::applyEvent);
        return equipoDocente;
    }

    public void agregarDocenteEscritura(Nombre nombre, Email email){
        var id = new DocenteEscrituraId();
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new DocenteEscrituraAgregado(id, nombre, email)).apply();
    }

    public void agregarDocenteEscucha(Nombre nombre, Email email){
        var id = new DocenteEscuchaId();
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new DocenteEscuchaAgregado(id, nombre, email)).apply();
    }

    public void agregarDocenteHabla(Nombre nombre, Email email){
        var id = new DocenteHablaId();
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new DocenteHablaAgregado(id, nombre, email)).apply();
    }

    public void agregarDocenteLectura(Nombre nombre, Email email){
        var id = new DocenteLecturaId();
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        appendChange(new DocenteLecturaAgregado(id, nombre, email)).apply();
    }

    public void agregarNivelId(NivelId nivelId){
        Objects.requireNonNull(nivelId);
        appendChange(new NivelAgregado(nivelId)).apply();
    }

    public void actualizarEmailDocenteEscritura(DocenteEscrituraId entityId, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        appendChange(new EmailDocenteEscrituraActualizado(entityId, email)).apply();
    }

    public void actualizarEmailDocenteEscucha(DocenteEscuchaId entityId, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        appendChange(new EmailDocenteEscuchaActualizado(entityId, email)).apply();
    }

    public void actualizarEmailDocenteHabla(DocenteHablaId entityId, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        appendChange(new EmailDocenteHablaActualizado(entityId, email)).apply();
    }

    public void actualizarEmailDocenteLectura(DocenteLecturaId entityId, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        appendChange(new EmailDocenteLecturaActualizado(entityId, email)).apply();
    }

    public Optional<NivelId> getConsulta(NivelId entityId){
        return niveles
                .stream()
                .filter(consulta -> consulta.equals(entityId))
                .findFirst();
    }

    public Set<NivelId> getNiveles() {
        return niveles;
    }

    public DocenteEscritura docenteEscritura(){
        return docenteEscritura;
    }

    public DocenteEscucha docenteEscucha(){
        return docenteEscucha;
    }

    public DocenteHabla docenteHabla(){
        return docenteHabla;
    }

    public DocenteLectura docenteLectura(){
        return docenteLectura;
    }

    public TipoEquipo tipoEquipo(){
        return tipoEquipo;
    }

}
