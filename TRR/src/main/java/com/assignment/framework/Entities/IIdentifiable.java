/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.framework.Entities;

import java.io.Serializable;

/**
 * General interface for a Business Object.
 *
 * @author Umar Saeed
 */
public interface IIdentifiable extends Serializable
{
    public long getId();

    public void setId(long id);
}
