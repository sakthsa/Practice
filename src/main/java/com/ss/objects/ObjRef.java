package com.ss.objects;

public class ObjRef {
    int a = 6;

    public ObjRef() {
    }

    public static void main(String[] args) {
        ObjRef obj = new ObjRef();
        obj.a = 8;
        ObjRef obj2 = obj;
        obj2.a = 7;
        System.out.println(obj.a);
        System.out.println(obj2.a);
    }
}
