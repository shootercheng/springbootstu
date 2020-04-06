package com.scd.boot.factory;

import java.util.UUID;

/**
 * @author James
 */
public class SqlSession {
    private String id;

    public SqlSession() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
