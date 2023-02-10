package com.universedust.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


/**
 * token 过滤器，校验token
 */
public class TokenGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        var request = exchange.getRequest();
        var response = exchange.getResponse();
        String token = request.getHeaders().getFirst("Authorization");
        if (token == null) {
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        }
        // todo 校验token

        request.getHeaders().add("userId","0");

        // 校验通过,到下一过滤器
        return chain.filter(exchange);
    }


    // 值越小越靠前
    @Override
    public int getOrder() {
        return -1000;
    }
}
