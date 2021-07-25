package main;

import main.common.Paging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static main.common.SendMail.sendEmail;

public class Main {
    public static void main(String args[]) {
////        发送邮件
//        int a[] = {0, 0, 0, 0};
//        for (int i = 0; i < 4; i++) {
//            a[i] = (int) (1 + Math.random() * 10);
//        }
//        int emailCode = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
//        System.out.println(emailCode);
//        String email="2380886380@qq.com";
//        int res = sendEmail(new String[]{email},//这里可以发送至任何邮箱
//                "BBRoom",
//                "<p><b>您好，欢迎来到BBRoom！</b></p>您的验证码是：" + emailCode,
//                "text/html;charset=utf-8");
//        System.out.println("\n发送结果:" + res);
//        物理分页
        List list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        Map map=Paging.getPage(list,list.size(),3,3);
        System.out.println(map);

    }
}
