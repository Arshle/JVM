/*
 * FileName: HeapOOM.java
 * Author:   Arshle
 * Date:     2018年02月11日
 * Description:
 */
package com.chezhibao.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈〉<br>
 * 〈〉
 *
 * @author Arshle
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本]（可选）
 */
public class HeapOOM {

    static class OOMObject{
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();

        while(true){
            list.add(new OOMObject());
        }
    }
}
