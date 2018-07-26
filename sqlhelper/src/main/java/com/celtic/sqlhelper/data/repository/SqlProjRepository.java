package com.celtic.sqlhelper.data.repository;

import com.celtic.sqlhelper.data.entity.SqlProj;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlProjRepository extends CrudRepository<SqlProj, Long> {
}
