package com.cog.Edureka_Module19_Assignment.model;

import org.springframework.stereotype.Service;

@Service
public class Country{
    private String code;
    private String name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public Country() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return java.text.MessageFormat.format("Code: {0}/t Name: {1}/n",code,name);
    }
}