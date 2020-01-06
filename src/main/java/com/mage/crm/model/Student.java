package com.mage.crm.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Data birthday;
    private String phone;
}
