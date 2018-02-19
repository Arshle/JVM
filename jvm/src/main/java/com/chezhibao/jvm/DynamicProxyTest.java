/*
 * FileName: DynamicProxyTest.java
 * Author:   Arshle
 * Date:     2018年02月19日
 * Description:
 */
package com.chezhibao.jvm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class DynamicProxyTest {

    interface IHello{
        void sayHello();
    }

    static class Hello implements IHello{

        @Override
        public void sayHello() {
            System.out.println("hello world");
        }
    }

    static class DynamicProxy implements InvocationHandler{

        Object originalObj;

        Object bind(Object originalObj){
            this.originalObj = originalObj;
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(),originalObj.getClass().getInterfaces(),this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("welcome");
            return method.invoke(originalObj,args);
        }
    }

    public static void main(String[] args) {
        IHello iHello = (IHello)new DynamicProxy().bind(new Hello());
        iHello.sayHello();
    }
}
