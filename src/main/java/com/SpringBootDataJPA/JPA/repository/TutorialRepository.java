package com.SpringBootDataJPA.JPA.repository;


import com.SpringBootDataJPA.JPA.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(path = "learningtutorials")
public interface TutorialRepository extends JpaRepository<Tutorial, Long>
{
    List<Tutorial> findByPublished(boolean published);

}
