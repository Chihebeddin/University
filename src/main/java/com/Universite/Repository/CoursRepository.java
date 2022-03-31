package com.Universite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Universite.Entities.Cours;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Long>{

}
