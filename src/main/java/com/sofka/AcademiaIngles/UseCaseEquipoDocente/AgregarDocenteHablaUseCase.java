package com.sofka.AcademiaIngles.UseCaseEquipoDocente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

import com.sofka.AcademiaIngles.equipoDocente.EquipoDocente;
import com.sofka.AcademiaIngles.equipoDocente.command.AgregarDocenteEscritura;
import com.sofka.AcademiaIngles.equipoDocente.command.AgregarDocenteHabla;

public class AgregarDocenteHablaUseCase extends UseCase<RequestCommand<AgregarDocenteHabla>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarDocenteHabla> agregarDocenteHablaRequestCommand){
        var command = agregarDocenteHablaRequestCommand.getCommand();

        EquipoDocente equipoDocente;

        equipoDocente = EquipoDocente.from(command.getEquipoDocenteId(),
                retrieveEvents());

        equipoDocente.agregarDocenteHabla(
                command.getNombre(),
                command.getEmail()
        );

        emit().onResponse(new ResponseEvents(equipoDocente.getUncommittedChanges()));
    }
}
