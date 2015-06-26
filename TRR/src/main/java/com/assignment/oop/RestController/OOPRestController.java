/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.oop.RestController;

import com.assignment.framework.RestController.IRestController;
import com.assignment.oop.ResponseBO.OOPResponseObject;
import com.assignment.oop.Service.OOPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Umar Saeed
 */
@RestController
@RequestMapping ("/rest")
public class OOPRestController implements IRestController
{

    @Autowired
    private OOPService iOOPService;

    @RequestMapping (value = "/{id}", method = RequestMethod.GET, produces =
    {
        "application/json", "application/xml"
    })
    OOPResponseObject getUserById(@PathVariable int id)
    {
        OOPResponseObject obj = new OOPResponseObject();
        String noStr = iOOPService.getEngString(id);
        if (noStr != null)
        {
            obj.setStatus(HttpStatus.OK);
            obj.setResult(noStr);
            obj.setMessage("Number to String");
        }
        else
        {
            obj.setStatus(HttpStatus.EXPECTATION_FAILED);
            obj.setMessage("invalid number");
        }
        return obj;
    }
}
