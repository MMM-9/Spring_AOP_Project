package com.aop.project.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectConfiguration {


        @Before("@annotation(com.aop.project.annotation.RequestValidation)")
        public void validateRequestParams(JoinPoint joinPoint) {
            Object[] args = joinPoint.getArgs();

            for (Object arg : args) {
                // Example: Validate String parameters are non-null or non-empty
                if (arg instanceof String str) {
                    if (str.isBlank()) {
                        throw new IllegalArgumentException("Request parameter cannot be blank");
                    }
                }

                // Example: Validate numeric parameters are positive
                if (arg instanceof Integer num) {
                    if (num <= 0) {
                        throw new IllegalArgumentException("Numeric parameter must be greater than 0");
                    }
                }
            }
        }


}
