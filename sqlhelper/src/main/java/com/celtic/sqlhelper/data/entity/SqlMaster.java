package com.celtic.sqlhelper.data.entity;

import javax.persistence.*;

@Entity
@Table(name="SQLMASTER")
public class SqlMaster {
    @Id
    @Column(name="SQL_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name="NAME")
    private String name;

    @Column(name="SQL_STRING")
    private String sqlString;

    @Column(name="SEARCH_WORDS")
    private String searchWords;

    @Column(name="COMMENTS")
    private String comments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSqlString() {
        return sqlString;
    }

    public void setSqlString(String sqlString) {
        this.sqlString = sqlString;
    }

    public String getSearchWords() {
        return searchWords;
    }

    public void setSearchWords(String searchWords) {
        this.searchWords = searchWords;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
