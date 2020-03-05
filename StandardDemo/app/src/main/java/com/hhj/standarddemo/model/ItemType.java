package com.hhj.standarddemo.model;

/**
 * @author huanghaojie
 * @date 2020/3/5.
 */
public enum ItemType {
    FRAME("框架", 1), NATIVE("原生", 2);
    private String name;
    private int code;

    private ItemType(String name, int code) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
