package com.exponent.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Batch {

    private int batchId;
    private String batchName;
    @Autowired
    private Faculty faculty1;

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Faculty getFaculty1() {
        return faculty1;
    }

    public void setFaculty1(Faculty faculty1) {
        this.faculty1 = faculty1;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId=" + batchId +
                ", batchName='" + batchName + '\'' +
                ", faculty1=" + faculty1 +
                '}';
    }
}
