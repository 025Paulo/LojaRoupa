package com.example.hotel.Loja.de.roupa.repository;

import com.example.hotel.Loja.de.roupa.dominio.Roupa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoupaRepository extends JpaRepository<Roupa, Integer> {

    public Roupa getById(Long id);

    public Roupa getByMarca(String marca);
}
