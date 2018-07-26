package com.celtic.sqlhelper.data.entity;

import javax.persistence.*;

/*
 Could be project name or jurisdiction name
 */
@Entity
@Table(name="CD_PROJECTS")
public class CdProjects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROJ_ID")
    private int projId;

    @Column(name = "PROJ_NAME")
    private String projName;

    public int getProjId() {
        return projId;
    }

    public void setProjId(int projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName;
    }
}
