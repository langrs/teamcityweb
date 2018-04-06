package com.lzm.si.controller;

import org.springframework.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        IdGenerator idGenerator = null;
        List<String> list = new ArrayList<String>();
        list.add("lzm");
        System.out.println("hello world" + getStr());
        int kk = Calc.calc(10,3);
    }
    public static String getStr(){
        return "bayb";
    }
}
