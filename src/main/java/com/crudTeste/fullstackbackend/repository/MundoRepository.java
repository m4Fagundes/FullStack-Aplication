package com.crudTeste.fullstackbackend.repository;

import com.crudTeste.fullstackbackend.model.Mundo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MundoRepository extends JpaRepository<Mundo, Long> {

}
