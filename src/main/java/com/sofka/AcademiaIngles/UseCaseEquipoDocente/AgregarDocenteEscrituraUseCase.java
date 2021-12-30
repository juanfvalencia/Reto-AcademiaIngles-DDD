package com.sofka.AcademiaIngles.UseCaseEquipoDocente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.AcademiaIngles.equipoDocente.EquipoDocente;
import com.sofka.AcademiaIngles.equipoDocente.command.AgregarDocenteEscritura;

public class AgregarDocenteEscrituraUseCase extends UseCase<RequestCommand<AgregarDocenteEscritura>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarDocenteEscritura> agregarDocenteEscrituraRequestCommand){
        var command = agregarDocenteEscrituraRequestCommand.getCommand();

        EquipoDocente equipoDocente;

        equipoDocente = EquipoDocente.from(command.getEquipoDocenteId(),
                retrieveEvents());

        equipoDocente.agregarDocenteEscritura(
                command.getNombre(),
                command.getEmail()
        );

        emit().onResponse(new ResponseEvents(equipoDocente.getUncommittedChanges()));
    }
}
