package edu.workshop.todo.todo_console.mapper;

import edu.workshop.todo.todo_console.model.Calendario;

import java.util.stream.Collectors;

import edu.workshop.todo.todo_console.dto.CalendarioDTO;

public class CalendarioMapper {
        public static Calendario toEntity(CalendarioDTO dto) {
                return Calendario.builder()
                                .tareas(dto.getTareas().stream()
                                                .map(TareaMapper::toEntity)
                                                .collect(Collectors.toList()))
                                .build();
        }

        public static CalendarioDTO toDTO(Calendario entity) {
                return CalendarioDTO.builder()
                                .tareas(entity.getTareas().stream()
                                                .map(TareaMapper::toDTO)
                                                .collect(Collectors.toList()))
                                .build();
        }

}