package com.atguigu.gulimall.member;

import java.lang.reflect.Field;
import com.atguigu.gulimall.member.GuRequest;

public class ReflectTest {

    public static void main(String[] args) throws Exception{
            GuRequest a = new GuRequest();
            a.setCode("BUG");
            a.setName("BUG");
            String className = a.getClass().getName();
            Class b =  Class.forName("com.atguigu.gulimall.member.GuRequest");
            Object instance =  Class.forName("com.atguigu.gulimall.member.GuRequest");
            Field[] f = b.getDeclaredFields();
            for(Field field : f){
                //field.setAccessible(true);
                System.out.println(field.get(a));
            }
        }
}
