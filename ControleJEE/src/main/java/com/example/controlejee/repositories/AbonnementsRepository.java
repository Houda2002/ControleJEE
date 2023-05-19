package com.example.controlejee.repositories;

import com.example.controlejee.entities.Abonnements;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbonnementsRepository extends JpaRepository<Abonnements,Long> {

}
