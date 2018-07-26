package com.celtic.sqlhelper.data.repository;

import com.celtic.sqlhelper.data.entity.CdProjects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CdProjectsRepository extends CrudRepository<CdProjects, Long> {
}



