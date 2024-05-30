package com.zhangjun.guli.gulimallgateway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 全局过滤器、将响应头加入test头
 */
@Component
public class MyGlobalFilter implements org.springframework.cloud.gateway.filter.GlobalFilter, Ordered {


    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getResponse().getHeaders().add("test","test");
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
