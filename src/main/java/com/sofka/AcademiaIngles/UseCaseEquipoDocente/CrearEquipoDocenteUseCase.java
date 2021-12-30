package com.sofka.AcademiaIngles.UseCaseEquipoDocente;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.AcademiaIngles.equipoDocente.EquipoDocente;
import com.sofka.AcademiaIngles.equipoDocente.command.CrearEquipoDocente;

public class CrearEquipoDocenteUseCase extends UseCase<RequestCommand<CrearEquipoDocente>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearEquipoDocente> crearEquipoDocenteRequestCommand){
        var command = crearEquipoDocenteRequestCommand.getCommand();

        EquipoDocente equipoDocente;

        equipoDocente = new EquipoDocente(
                command.getEquipoDocenteId(),
                command.getTipoEquipo()
        );
        emit().onResponse(new ResponseEvents(equipoDocente.getUncommittedChanges()));
    }
}
