package org.gfg.notificationdemo;

import org.springframework.stereotype.Component;

@Component
public class SMSGateway1 {

    public SMSGateway1(){
        System.out.println("Hey In the sms gateway1");

    }

    public void send(String msg){
        System.out.println("sent message is : " +msg);
    }
}
