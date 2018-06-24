package com.fengwenyi.learn.java.mybatisenum.service;

import com.fengwenyi.learn.java.mybatisenum.model.UserModel;

import java.util.List;

/**
 * @author Wenyi Feng
 */
public interface IUserService {

    boolean save(UserModel model);

    List<UserModel> findAll();

}
