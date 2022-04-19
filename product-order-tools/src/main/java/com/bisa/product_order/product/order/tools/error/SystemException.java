/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.product.order.tools.error;

import java.io.Serializable;
import javax.ejb.ApplicationException;

/**
 *
 * @author brian.barrera
 */
@ApplicationException(rollback = true, inherited = true)
public class SystemException extends Exception implements Serializable{
    public SystemException(){
        super();
    }

    public SystemException(String exception){
        super(exception);
    }

    public SystemException(Throwable throwable){
        super(throwable);
    }

    public SystemException(String exception, Throwable throwable){
        super(exception, throwable);
    }
}
