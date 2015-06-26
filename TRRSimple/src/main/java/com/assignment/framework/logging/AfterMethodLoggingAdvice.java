/*
 * Framework
 * Source code is confidential.
 * (c) Copyright Umar Saeed. All rights reserved.
 *
 * Filename: AfterMethodLoggingAdvice.java
 *
 * Version		Author              Reason
 ** 1.0			Umar Saeed          Created
 *
 */
package com.assignment.framework.logging;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author Umar Saeed
 */
public class AfterMethodLoggingAdvice implements AfterReturningAdvice
{
    public void afterReturning(Object returnValue, Method method, Object[] args,
            Object target) throws Throwable
    {
        System.err.println("[DEBUG] Exiting " + method);
    }
}
