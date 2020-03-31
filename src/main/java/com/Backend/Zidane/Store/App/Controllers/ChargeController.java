package com.Backend.Zidane.Store.App.Controllers;

import com.Backend.Zidane.Store.App.Stripe.ChargeRequest;
import com.Backend.Zidane.Store.App.Stripe.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.AuthenticationException;

@Controller
public class ChargeController {
    @Autowired
    private StripeService paymentsService;

    @PostMapping("/charge")
    public void charge (ChargeRequest chargeRequest)
            throws StripeException, AuthenticationException {
        Charge charge = paymentsService.charge(chargeRequest);
    }
}
