package org.gfg.notificationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NotificationClient {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.gfg.notificationdemo");
        NotificationService service = (NotificationService) context.getBean("notificationService");
        service.sendSMS("OTP is : 2345");
    }
}
