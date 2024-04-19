package com.ingesoft.tareas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tareas")
@Data
public class Tarea {

    @Id
    @GeneratedValue
    Integer id;

    String descripcion;

    String detalles;

    Boolean completada;

}
