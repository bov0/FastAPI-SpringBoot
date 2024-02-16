package com.example.APIRest.repository;

import com.example.APIRest.model.Ejemplo;
import com.example.APIRest.util.ImageUtils;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EjemploRepository extends JpaRepository<Ejemplo, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    List<Ejemplo> findByNombreContainingIgnoreCase(String nombre);

    Optional<Ejemplo> findByNombre(String nomfich);

}