package com.model.strategry.checkPayment;

import java.util.Map;

public class JHPayCheck implements PaymentCheck{
    @Override
    public String doCheckPayment(Map<String, Object> param) {

        String busiAmount="";
        //查询金额
        if (!"".equals(busiAmount)){
            //执行聚合支付逻辑
            System.out.println("执行聚合支付对账逻辑。。。。");
        }
        System.out.println("已经执行聚合支付对账逻辑。。。。。");
        return busiAmount;

//        busiAmount = resCenterDao.selectOne("TiBPayLogSQL.selectBarcode", param);
//        if (StringUtil.isNotBank(busiAmount)) {
//            log.info("==============一码付调用支付通知结果 start============");
//            obj.put("BUSI_PAY_TOOLS", "扫码对账");
//            Map<String,Object> resultMap = new HashMap<>();
//            resultMap=interfaceAdpterRSVImpl.updateOnline(obj);
//            log.info("返回数据：data[{}]",JSON.toJSONString(resultMap));
//            if("00000".equals(resultMap.get("BUSI_RSPCODE"))){//支付成功
//                //记录操作日志
//                saveActionLog("ZXZF", obj.get("TRADE_ID").toString());
//            }
//            log.info("==============一码付调用支付通知结果 end============");
//        }
    }
}
