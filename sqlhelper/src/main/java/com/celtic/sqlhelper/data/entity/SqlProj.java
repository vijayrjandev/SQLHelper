package com.celtic.sqlhelper.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "SQL_PROJ")
public class SqlProj {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROJ_ID")
    private long projId;

    @Column(name = "SQL_ID")
    private long sqlId;

    public long getProjId() {
        return projId;
    }

    public void setProjId(long projId) {
        this.projId = projId;
    }

    public long getSqlId() {
        return sqlId;
    }

    public void setSqlId(long sqlId) {
        this.sqlId = sqlId;
    }
}
