package com.Universite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Universite.Entities.Universite;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends JpaRepository<Universite,Long> {
																																																														
}
