package com.Backend.Zidane.Store.App.Controllers;

import com.Backend.Zidane.Store.App.Logging.ChargeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ChargeMVCConfig implements WebMvcConfigurer {

    @Autowired
    private ChargeInterceptor chargeInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(chargeInterceptor)
                .addPathPatterns("/**/charge/**/");
    }
}
