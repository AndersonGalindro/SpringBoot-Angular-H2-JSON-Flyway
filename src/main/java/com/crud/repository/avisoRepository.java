package com.crud.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.aviso.aviso;

@Repository
public interface avisoRepository extends JpaRepository<aviso, Integer>{

}
