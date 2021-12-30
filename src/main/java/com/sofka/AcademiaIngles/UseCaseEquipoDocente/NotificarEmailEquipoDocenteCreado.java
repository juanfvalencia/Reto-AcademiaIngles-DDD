package com.sofka.AcademiaIngles.UseCaseEquipoDocente;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.AcademiaIngles.equipoDocente.event.EquipoDocenteCreado;
import com.sofka.AcademiaIngles.equipoDocente.value.EquipoDocenteId;

import java.util.List;

public class NotificarEmailEquipoDocenteCreado extends UseCase<TriggeredEvent<EquipoDocenteCreado>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<EquipoDocenteCreado> equipoDocenteCreadoTriggeredEvent){
        var event = equipoDocenteCreadoTriggeredEvent.getDomainEvent();

        var service = getService(SendEmailService.class).orElseThrow();

        boolean isValid = service.send(
                EquipoDocenteId.of(event.aggregateRootId()),
                "equipodocente@academiainglessofka.com.co",
                "Nuevo equipo de docentes creado"
        );

        if(!isValid){
            throw new BusinessException(event.aggregateRootId(), "No fue posible enviar el correo");
        }

        emit().onResponse(new ResponseEvents(List.of()));
    }
}
