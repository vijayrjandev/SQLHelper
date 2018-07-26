package com.celtic.sqlhelper.data.repository;

import com.celtic.sqlhelper.data.entity.SqlInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlInfoRepository extends CrudRepository<SqlInfo, Long> {
}
