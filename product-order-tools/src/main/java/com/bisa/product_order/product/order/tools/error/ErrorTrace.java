/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bisa.product_order.product.order.tools.error;

/**
 *
 * @author brian.barrera
 */
public class ErrorTrace {
    private String error;
    private String name;
    private StackTraceElement traceElement;

    public ErrorTrace(String error, String name, StackTraceElement traceElement) {
        this.error = error;
        this.name = name;
        this.traceElement = traceElement;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StackTraceElement getTraceElement() {
        return traceElement;
    }

    public void setTraceElement(StackTraceElement traceElement) {
        this.traceElement = traceElement;
    }
    
}
