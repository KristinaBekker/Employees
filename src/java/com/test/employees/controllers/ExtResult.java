package com.test.employees.controllers;

import com.test.employees.model.EmployeesEntity;

public class ExtResult {
    private boolean success;
    private EmployeesEntity data;


    public ExtResult(boolean success, EmployeesEntity data) {
        this.success = success;
        this.data = data;
    }

    public ExtResult() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public EmployeesEntity getData() {
        return data;
    }

    public void setData(EmployeesEntity data) {
        this.data = data;
    }
}
