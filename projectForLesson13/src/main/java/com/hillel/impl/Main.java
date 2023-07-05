package com.hillel.impl;

public class Main {

    public static void main(String[] args) {
        iPhones iphoneObject = new iPhones("iPhone7",32, 16);
        Androids androidObject = new Androids("Xiaomi",64,16);
        androidObject.phoneInfo();
        androidObject.call();
        iphoneObject.phoneInfo();
        iphoneObject.sms();

    }

}