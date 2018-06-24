package com.fengwenyi.learn.java.mybatisenum.model;

import com.fengwenyi.learn.java.mybatisenum.Status;

/**
 * @author Wenyi Feng
 */
public class UserModel {

    private Long id;

    private Status status;

    public UserModel() {
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
