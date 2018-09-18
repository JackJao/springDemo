package com.yangtao.springDemo.domain;

import java.io.Serializable;

/**
 * @author Gao
 * @date 2018/8/2 11:02
 */
public class Spitter implements Serializable{

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
