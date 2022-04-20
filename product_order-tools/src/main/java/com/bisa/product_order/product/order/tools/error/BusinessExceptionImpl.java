/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.tools.error;

import com.bisa.product_order.tools.message.ValidationMessage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brian.barrera
 */
public class BusinessExceptionImpl implements BusinessExceptionServ, Serializable{
    public final List<ErrorTrace> errorList = new ArrayList<>();

    public BusinessExceptionImpl (){
        super();
    }
    public void isNull(Object object, String name){
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        errorList.add(new ErrorTrace( ValidationMessage.IS_NULL, name, element[element.length-1]));
    }

    public void isNullOrEmpty(Object object, String name){
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        errorList.add(new ErrorTrace( ValidationMessage.IS_NULL_OR_EMPTY, name, element[element.length-1]));
    }

    public void throwException() throws UnsupportedOperationException{
        throw new UnsupportedOperationException(ValidationMessage.NOT_SUPPORTED_ERROR);
    }
}
