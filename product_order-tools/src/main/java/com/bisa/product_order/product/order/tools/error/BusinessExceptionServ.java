/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.tools.error;

/**
 *
 * @author brian.barrera
 */
public interface BusinessExceptionServ {

    void isNull(Object object, String name);

    void isNullOrEmpty(Object object, String name);

    <T extends Throwable> void throwException() throws T;
}
