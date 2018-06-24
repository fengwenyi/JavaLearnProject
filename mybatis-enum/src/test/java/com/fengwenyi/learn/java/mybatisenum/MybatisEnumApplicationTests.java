package com.fengwenyi.learn.java.mybatisenum;

import com.fengwenyi.learn.java.mybatisenum.model.UserModel;
import com.fengwenyi.learn.java.mybatisenum.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisEnumApplicationTests {

@Autowired
private IUserService userService;

@Test
public void contextLoads() {

    find();
    // insert();
}

private void insert() {
    UserModel model = new UserModel();
    model.setStatus(Status.LOGIN);
    boolean rs = userService.save(model);
    System.out.println(rs);
}

private void find() {
    List<UserModel> modelList = userService.findAll();
    for (UserModel model : modelList) {
        System.out.println(model.toString());
    }
}

}
