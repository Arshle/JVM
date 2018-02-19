/*
 * FileName: DispatchTest.java
 * Author:   Arshle
 * Date:     2018年02月19日
 * Description:
 */
package com.chezhibao.jvm;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class DispatchTest {
    class GrandFather{
        void thinking(){
            System.out.println("I am GrandFather");
        }
    }

    class Father extends GrandFather{

        @Override
        void thinking(){
            System.out.println("I am father");
        }
    }

    class Son extends Father{

        @Override
        void thinking() {
            MethodType type = MethodType.methodType(void.class);

        }
    }
}
