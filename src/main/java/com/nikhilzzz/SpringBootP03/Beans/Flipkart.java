package com.nikhilzzz.SpringBootP03.Beans;

import org.springframework.stereotype.Component;

@Component
public class Flipkart {

    Partners pat;

    public void paymentGateway(String Amount)
    {
        pat.payments(Amount);
    }
}
