package com.celtic.sqlhelper.data.repository;

import com.celtic.sqlhelper.data.entity.SqlMaster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlMasterRepository extends CrudRepository<SqlMaster, Long> {
    SqlMaster findBySearchWords(String searchWord);
}
