package com.model.strategry.checkPayment;

import com.model.strategry.pay.PayTypeContest;

import java.util.HashMap;

public class CheckPaymentService {
    //ZXZF, // 扫码支付
//    WYZF, // 网银(大额)支付
//    JHZF; // 聚合支付
    private static HashMap<String,PaymentCheck> paymentCheckHashMap = new HashMap <>();
    static {
        paymentCheckHashMap.put(PaymentTypeConst.SM_PAY,new ScanCardCheck());
        paymentCheckHashMap.put(PaymentTypeConst.JH_PAY,new JHPayCheck());
    }

    public static PaymentCheck doCheck(String payKey){
        return paymentCheckHashMap.get(payKey);
    }
}
