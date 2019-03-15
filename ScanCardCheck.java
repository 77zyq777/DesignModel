package com.model.strategry.checkPayment;

import java.util.Map;

public class ScanCardCheck implements PaymentCheck{
    @Override
    public String doCheckPayment(Map<String, Object> param) {
        String busiAmount="";
        if(!"".equals(busiAmount)){
            System.out.println("执行扫码付对账逻辑。。。。。");
        }
        System.out.println("已经执行完成扫码对账逻辑。。。。。");
        return busiAmount;
    }
}
