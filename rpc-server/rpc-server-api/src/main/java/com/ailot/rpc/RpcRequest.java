package com.ailot.rpc;

import java.io.Serializable;

/**
 * @author ailot
 * @version RpcRequest.java, 2019年07月14日 上午11:02
 */
public class RpcRequest implements Serializable {

    private String className;

    private String methodName;

    private Object[] parameters;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setParameters(Object[] parameters) {
        this.parameters = parameters;
    }
}
