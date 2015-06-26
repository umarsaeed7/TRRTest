/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.oop.WebController;

import com.assignment.framework.WebController.IWebController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Umar Saeed
 */
@Controller
public class GeneralController implements IWebController
{

    @RequestMapping (value = "/", method = RequestMethod.GET)
    public String index()
    {
        return "index";
    }

}
