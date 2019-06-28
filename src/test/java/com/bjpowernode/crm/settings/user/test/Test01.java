package com.bjpowernode.crm.settings.user.test;

import com.bjpowernode.crm.utils.DateTimeUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {

        //验证失效时间
        /*String expireTime = "2018-10-10 10:10:10";
        String sysTime = DateTimeUtil.getSysTime();
        int count = expireTime.compareTo(sysTime);
        System.out.println(count);*/

        //验证锁定状态
        /*String lockState = "0";
        if("0".equals(lockState)){
            System.out.println("账户已锁定");
        }*/

        //验证ip地址
       /* String ip = "192.168.1.6";
        String allowIps = "192.168.1.1,192.168.1.2,192.168.1.3";
        if(!allowIps.contains(ip)){
            System.out.println("ip地址无效");
        }*/

       /*
            servlet
            controller:接收请求，接收参数，为浏览器做响应
            service:处理业务逻辑，
            dao:与数据库交互，

        */
    }
}
