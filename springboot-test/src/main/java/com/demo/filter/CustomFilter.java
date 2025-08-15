package com.demo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@Component
public class CustomFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, 
                                   HttpServletResponse response, 
                                   FilterChain filterChain)
            throws ServletException, IOException {
        
        // 1. 前置处理
        long startTime = System.currentTimeMillis();
        log.info("Request started for: " + request.getRequestURI());
        
        // 2. 执行过滤器链
        filterChain.doFilter(request, response);
        
        // 3. 后置处理
        long duration = System.currentTimeMillis() - startTime;
        log.info("Request completed in " + duration + "ms");
    }
}