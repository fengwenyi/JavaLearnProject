package com.fengwenyi.learn.java.restructure;

import com.fengwenyi.learn.java.restructure.init.PayExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestructureApplicationTests {

    @Autowired
    private PayExample payExample;

    @Test
    public void contextLoads() {
        pay();
    }

    public void pay() {
        payExample.play(PayType.aliPay);
    }

}
