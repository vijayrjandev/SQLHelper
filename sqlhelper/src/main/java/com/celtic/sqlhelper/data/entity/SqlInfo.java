package com.celtic.sqlhelper.data.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "SQLINFO")
public class SqlInfo {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SQL_INFO_ID")
    private long id;
    @Column(name="SQL_ID")
    private long sqlId;
    @Column(name="VAR_TYPE")
    private String varType;
    @Column(name="VAR_VALUE")
    private String varValue;
    @Column(name="COMMENTS")
    private String comments;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSqlId() {
        return sqlId;
    }

    public void setSqlId(long sqlId) {
        this.sqlId = sqlId;
    }

    public String getVarType() {
        return varType;
    }

    public void setVarType(String varType) {
        this.varType = varType;
    }

    public String getVarValue() {
        return varValue;
    }

    public void setVarValue(String varValue) {
        this.varValue = varValue;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
