package io.nyarosys.gateway.config;

import lombok.Getter;

@Getter
public class GatewayConfig {
    private String baseMessage;
    private boolean preLogger;
    private boolean postLogger;

    public GatewayConfig(String baseMessage, boolean preLogger, boolean postLogger) {
        this.baseMessage = baseMessage;
        this.preLogger = preLogger;
        this.postLogger = postLogger;
    }
}
