/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.oop.Service;

import com.assignment.framework.Service.IService;
import com.assignment.oop.Util.NumToEngCont;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Umar Saeed
 */
@Service
public class OOPService implements IService
{

    @Transactional
    public String getEngString(int number)
    {
        return NumToEngCont.getInstance().contToEng(number);
    }
}
