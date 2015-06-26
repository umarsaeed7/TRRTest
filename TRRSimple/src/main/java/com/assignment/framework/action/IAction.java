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
package com.assignment.framework.action;

/**
 * General interface for an Action.
 *
 * @author Umar Saeed
 */
public interface IAction
{
    public void execute(Object controller) throws Exception;
}
