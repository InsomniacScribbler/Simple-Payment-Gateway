package com.nikhilzzz.SpringBootP03.Beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ptm")
@Primary
public class PayTM implements Partners{

    PayTM(){
        System.out.println("PayTM CONSTRUCTOR");
    }

    @Override
    public void payments(String Amount){
        System.out.println("Payment done to PayTM for Rs."+Amount);
    }
}
