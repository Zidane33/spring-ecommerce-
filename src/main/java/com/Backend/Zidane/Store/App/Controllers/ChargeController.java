package com.Backend.Zidane.Store.App.Controllers;

import com.Backend.Zidane.Store.App.Stripe.ChargeRequest;
import com.Backend.Zidane.Store.App.Stripe.StripeService;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;

@RestController
@RequestMapping("/charge")
public class ChargeController {
    @Autowired
    private StripeService paymentsService;

    @CrossOrigin(origins = "http://zidane-store-react-bucket.s3-website-us-east-1.amazonaws.com")
    @PostMapping
    public void charge(@RequestBody ChargeRequest chargeRequest)
            throws StripeException, AuthenticationException {
        chargeRequest.setDescription("");
        chargeRequest.setCurrency(ChargeRequest.Currency.CAD);
        Charge charge = paymentsService.charge(chargeRequest);
    }
}

