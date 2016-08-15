package com.mycompany.autocode.utils;

import java.util.UUID;

/**
 * author: JinBingBing
 * description: UUID生成工具
 * time: 2016/8/15 18:07.
 */

public class UUIDUtils {

    public UUIDUtils() {
    }

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(getUUID());
    }

}
