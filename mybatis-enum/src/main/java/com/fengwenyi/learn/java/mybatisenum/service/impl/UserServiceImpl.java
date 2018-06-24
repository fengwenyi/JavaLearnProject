package com.fengwenyi.learn.java.mybatisenum.service.impl;

import com.fengwenyi.learn.java.mybatisenum.dao.UserDao;
import com.fengwenyi.learn.java.mybatisenum.model.UserModel;
import com.fengwenyi.learn.java.mybatisenum.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wenyi Feng
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    @Override
    public boolean save(UserModel model) {
        if (model != null) {
            if (model.getId() != null
                    && model.getId() > 0) {

            } else {
                return userDao.insert(model) == 1;
            }
        }
        return false;
    }

    @Override
    public List<UserModel> findAll() {
        return userDao.queryAll();
    }
}
