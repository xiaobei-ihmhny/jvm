package com.xiaobei.jvm.unit2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiaobei
 * @createTime: 2018-07-13 6:58
 * @since: JDK 1.8
 * @description: Java堆内存溢出异常测试
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while(true) {
            list.add(new OOMObject());
        }
    }
}
