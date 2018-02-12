/*
 * FileName: DirectMemoryOOM.java
 * Author:   Arshle
 * Date:     2018年02月11日
 * Description:
 */
package com.chezhibao.jvm;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class DirectMemoryOOM {
    private static final int _1mb = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while(true){
            unsafe.allocateMemory(_1mb);
        }
    }
}
