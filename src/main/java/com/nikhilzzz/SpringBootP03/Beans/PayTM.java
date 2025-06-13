package com.nikhilzzz.SpringBootP03.Beans;

import org.springframework.stereotype.Component;

@Component("ptm")
public class PayTM implements Partners{

    PayTM(){
        System.out.println("PayTM CONSTRUCTOR");
    }

    @Override
    public void payments(String Amount){
        System.out.println("Payment done to JusPay for Rs."+Amount);
    }
}
