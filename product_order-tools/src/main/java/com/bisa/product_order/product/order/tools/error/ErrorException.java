/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.tools.error;

import java.io.Serializable;

/**
 *
 * @author brian.barrera
 */
public class ErrorException extends SystemException implements BusinessExceptionServ, Serializable{
    
    private final BusinessExceptionImpl businessException;

    public ErrorException(String string){
        super(string);
        businessException = new BusinessExceptionImpl();
    }
    public void isNull(Object object, String name){
        businessException.isNull(object, name);
    }

    public void isNullOrEmpty(Object object, String name){
        businessException.isNullOrEmpty(object, name);
    }

    @Override
    public void throwException() throws ErrorException{
        if(businessException.errorList.size() > 0){
            throw this;
        }
    }
}
