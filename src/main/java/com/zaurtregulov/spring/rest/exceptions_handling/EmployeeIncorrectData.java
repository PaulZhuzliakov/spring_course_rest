package com.zaurtregulov.spring.rest.exceptions_handling;

public class EmployeeIncorrectData {
    private String info;

    public EmployeeIncorrectData() {
    }

    public EmployeeIncorrectData(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
