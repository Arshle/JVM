/*
 * FileName: TenureThresholdTest.java
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
public class TenureThresholdTest {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws InterruptedException {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];
    }
}
