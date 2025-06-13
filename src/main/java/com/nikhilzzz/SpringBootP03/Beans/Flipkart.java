package com.nikhilzzz.SpringBootP03.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
    Flipkart(){
        System.out.println("Flipkart CONSTRUCTOR");
    }
    @Autowired
   // @Qualifier("jp")
    Partners pat;

    public void paymentGateway(String Amount)
    {
        pat.payments(Amount);
    }
}
