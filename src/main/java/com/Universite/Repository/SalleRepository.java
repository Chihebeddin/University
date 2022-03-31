package com.Universite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Universite.Entities.Salle;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long>{

}
