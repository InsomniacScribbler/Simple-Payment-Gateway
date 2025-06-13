package com.nikhilzzz.SpringBootP03.Beans;

import org.springframework.stereotype.Component;

@Component("jp")
public class jusPay implements Partners{
    @Override
    public void payments(String Amount){
        System.out.println("Payment done to JusPay for Rs."+Amount);
    }
}
