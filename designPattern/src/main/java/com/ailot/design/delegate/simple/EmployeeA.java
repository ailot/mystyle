/*
 * LY.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

package com.ailot.design.delegate.simple;

/**
 * @author ailot
 * @version Employee.java, 2019年03月26日 下午10:14
 */
public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("加密操作，执行"+command);
    }
}
