package org.gfg.notificationdemo;

import org.springframework.stereotype.Component;

@Component
public class SMSGateway {

//    String name;

    public void send(String msg){
        System.out.println("sent message is : " +msg);
    }

}
// we have annotation in spring boot