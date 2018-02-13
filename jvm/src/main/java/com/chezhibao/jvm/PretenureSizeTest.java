/*
 * FileName: PretenureSizeTest.java
 * Author:   Arshle
 * Date:     2018年02月12日
 * Description:
 */
package com.chezhibao.jvm;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class PretenureSizeTest {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[4 * _1MB];
    }
}
