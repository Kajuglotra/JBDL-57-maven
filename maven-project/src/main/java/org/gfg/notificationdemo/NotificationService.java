package org.gfg.notificationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //notificationService
public class NotificationService {
//    @Autowired
    private SMSGateway smsGateway; //field injection


    //setter injection
    @Autowired
    public void setSmsGateway(SMSGateway smsGateway) {
        this.smsGateway = smsGateway;
    }

    public NotificationService(){
        System.out.println("I am inside NotificationService");
    }

    // constructor injection


//    public NotificationService(SMSGateway smsGateway) {
//        this.smsGateway = smsGateway;
//    }

    public void sendSMS(String msg){
        smsGateway.send(msg);
    }
}
