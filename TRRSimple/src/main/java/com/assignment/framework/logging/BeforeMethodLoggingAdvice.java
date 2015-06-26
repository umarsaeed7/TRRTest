/*
 * Framework
 * Source code is confidential.
 * (c) Copyright Umar Saeed. All rights reserved.
 *
 * Filename: IAction.java
 *
 * Version		Author              Reason
 ** 1.0			Umar Saeed          Created
 *
 */
package com.assignment.framework.logging;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Umar Saeed
 */
public class BeforeMethodLoggingAdvice implements MethodBeforeAdvice
{
    public void before(Method method, Object[] args, Object target)
            throws Throwable
    {
        System.err.println("[DEBUG] Entering " + method);
    }
}
