package com.nikhilzzz.SpringBootP03.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
    @Autowired
    @Qualifier("jp")
    Partners pat;

    public void paymentGateway(String Amount)
    {
        pat.payments(Amount);
    }
}
