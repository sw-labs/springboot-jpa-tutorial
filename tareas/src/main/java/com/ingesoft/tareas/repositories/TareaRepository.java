package com.ingesoft.tareas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ingesoft.tareas.model.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer>
{

}
