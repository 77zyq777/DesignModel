package com.model.strategry.checkPayment;

import java.util.HashMap;
import java.util.Map;

public class PaymentCheckTest {
    public static void main(String[] args) {
        PaymentCheck pk=CheckPaymentService.doCheck(PaymentTypeConst.JH_PAY);
        Map<String,Object> param = new HashMap <>();
        pk.doCheckPayment(param);
    }
}
