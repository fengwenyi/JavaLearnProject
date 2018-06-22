package com.fengwenyi.learn.java.restructure.init;

import com.fengwenyi.learn.java.restructure.PayType;
import org.springframework.stereotype.Component;

/**
 * 以支付为例
 * @author Wenyi Feng
 */
@Component
public class PayExample {

    public void play(int payType) {
        switch (payType) {
            case PayType.aliPay:
                aliPay();
                break;
            case PayType.wxPay:
                wxPay();
                break;
            case PayType.bankPay:
                bankPay();
                break;
            default:
                System.out.println("支付方式不正确");
                break;
        }
    }

    private void aliPay() {
        System.out.println("支付宝支付");
    }

    private void wxPay() {
        System.out.println("微信支付");
    }

    private void bankPay() {
        System.out.println("银行卡支付");
    }
}