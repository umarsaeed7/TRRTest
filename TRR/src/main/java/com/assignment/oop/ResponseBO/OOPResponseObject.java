/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.oop.ResponseBO;

import com.assignment.framework.ResponseBO.ResponseObject;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.http.HttpStatus;

/**
 *
 * @author Umar Saeed
 */
@XmlRootElement (name = "Response")
public class OOPResponseObject implements ResponseObject
{
    private HttpStatus status;
    private String message;
    private Object result;

    public OOPResponseObject()
    {
        this.setDefaultValue();
    }

    private void setDefaultValue()
    {
        this.setStatus(HttpStatus.NOT_ACCEPTABLE);
    }

    /**
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message)
    {
        this.message = message;
    }

    /**
     * @return the status
     */
    @Override
    public HttpStatus getStatus()
    {
        return status;
    }

    /**
     * @param status the status to set
     */
    @Override
    public void setStatus(HttpStatus status)
    {
        this.status = status;
    }

    /**
     * @return the result
     */
    @Override
    public Object getResult()
    {
        return result;
    }

    /**
     * @param result the result to set
     */
    @Override
    public void setResult(Object result)
    {
        this.result = result;
    }
}
