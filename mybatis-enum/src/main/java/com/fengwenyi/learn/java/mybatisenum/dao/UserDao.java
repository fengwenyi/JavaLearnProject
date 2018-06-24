package com.fengwenyi.learn.java.mybatisenum.dao;

import com.fengwenyi.learn.java.mybatisenum.model.UserModel;

import java.util.List;

/**
 * @author Wenyi Feng
 */
public interface UserDao {

    int insert(UserModel model);

    List<UserModel> queryAll();

}
