package com.nikhilzzz.SpringBootP03.Beans;

import org.springframework.stereotype.Component;

@Component("rp")
public class RazorPay implements Partners{
    RazorPay(){
        System.out.println("RazorPay CONSTRUCTOR");
    }
    @Override
    public void payments(String Amount) {
        System.out.println("Payment done to JusPay for Rs."+Amount);
    }
}
