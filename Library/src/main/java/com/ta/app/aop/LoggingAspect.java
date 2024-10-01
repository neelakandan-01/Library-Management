package com.ta.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.ta.app.controller..*(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method called: " + jp.getSignature().getName());
    }
    
    @After("execution(* com.ta.app.controller..*(..))")
    public void logMethodExecuted(JoinPoint jp) {
		LOGGER.info("Method Executed "+jp.getSignature().getName());
	}
}
