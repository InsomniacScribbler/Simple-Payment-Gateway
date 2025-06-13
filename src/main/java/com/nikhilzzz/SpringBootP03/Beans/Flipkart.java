package com.nikhilzzz.SpringBootP03.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@CofigurationProperties(prefix = "db")
public class Flipkart {
    Flipkart(){
        System.out.println("Flipkart CONSTRUCTOR");
    }
    @Autowired
   // @Qualifier("jp")
    Partners pat;

    @Value("${db.url}")
    String URL;

    public void paymentGateway(String Amount)
    {

        System.out.println(URL);
        pat.payments(Amount);
    }
}
