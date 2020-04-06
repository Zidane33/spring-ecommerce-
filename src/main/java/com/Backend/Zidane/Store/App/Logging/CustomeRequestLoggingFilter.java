package com.Backend.Zidane.Store.App.Logging;

import org.springframework.web.filter.CommonsRequestLoggingFilter;

public class CustomeRequestLoggingFilter
        extends CommonsRequestLoggingFilter {

    public CustomeRequestLoggingFilter() {
        super.setIncludeQueryString(false);
        super.setIncludePayload(false);
        super.setMaxPayloadLength(10000);
    }
}

