/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.framework.ResponseBO;

import java.io.Serializable;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Umar Saeed
 */
public interface ResponseObject extends Serializable
{
    /**
     * @return the status
     */
    public HttpStatus getStatus();

    /**
     * @param status the status to set
     */
    public void setStatus(HttpStatus status);

    /**
     * @return the result
     */
    public Object getResult();

    /**
     * @param result the result to set
     */
    public void setResult(Object result);
}
