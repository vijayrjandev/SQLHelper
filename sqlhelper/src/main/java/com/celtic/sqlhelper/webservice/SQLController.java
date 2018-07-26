package com.celtic.sqlhelper.webservice;

import com.celtic.sqlhelper.data.entity.SqlMaster;
import com.celtic.sqlhelper.data.repository.SqlMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SQLController {

    @Autowired
    private SqlMasterRepository sqlMasterRepository;

    @RequestMapping(value="/queries",method = RequestMethod.GET)
    List<SqlMaster> findAll(String searchWord){
        List<SqlMaster> list= new ArrayList<>();
        Iterable<SqlMaster> sqlMaster = this.sqlMasterRepository.findAll();
        sqlMaster.forEach(sqlMaster1 -> list.add(sqlMaster1));
        return list;
    }

    @RequestMapping(value="/searchWord",method = RequestMethod.GET )
    SqlMaster findbySearchWords(String searchWord){

        SqlMaster sql = this.sqlMasterRepository.findBySearchWords("#User");
        return sql;
    }

}
