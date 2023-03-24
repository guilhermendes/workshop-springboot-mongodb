package com.guilhermemendes.workshopspringbootmongodb.resources.exception;

import java.io.Serializable;

public class StandarError implements Serializable {
    private long timestemp;
    private Integer status;
    private String message;
    private String path;

    public StandarError(){
    }

    public StandarError(long timestemp, Integer status, String error, String message, String path) {
        this.timestemp = timestemp;
        this.status = status;
        this.message = message;
        this.path = path;
    }

    public long getTimestemp() {
        return timestemp;
    }

    public void setTimestemp(long timestemp) {
        this.timestemp = timestemp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


}
