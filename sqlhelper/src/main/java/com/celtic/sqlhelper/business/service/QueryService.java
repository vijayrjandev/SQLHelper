package com.celtic.sqlhelper.business.service;

import com.celtic.sqlhelper.business.domain.SqlIssue;
import com.celtic.sqlhelper.data.entity.SqlMaster;
import com.celtic.sqlhelper.data.repository.CdProjectsRepository;
import com.celtic.sqlhelper.data.repository.SqlInfoRepository;
import com.celtic.sqlhelper.data.repository.SqlMasterRepository;
import com.celtic.sqlhelper.data.repository.SqlProjRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QueryService {
    private SqlProjRepository sqlProjRepository;
    private SqlMasterRepository sqlMasterRepository;
    private SqlInfoRepository sqlInfoRepository;
    private CdProjectsRepository cdProjectsRepository;

    public QueryService(SqlProjRepository sqlProjRepository, SqlMasterRepository sqlMasterRepository, SqlInfoRepository sqlInfoRepository, CdProjectsRepository cdProjectsRepository) {
        this.sqlProjRepository = sqlProjRepository;
        this.sqlMasterRepository = sqlMasterRepository;
        this.sqlInfoRepository = sqlInfoRepository;
        this.cdProjectsRepository = cdProjectsRepository;
    }

    List<SqlIssue> getAllIssues(String projName){
        Iterable<SqlMaster> allQueries =  this.sqlMasterRepository.findAll();
    }
}
