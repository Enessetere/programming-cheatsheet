package com.example.designpatterns.demo;

import com.example.designpatterns.creational.objectpool.CustomObjectPool;
import com.example.designpatterns.creational.objectpool.ObjectPool;

public class ObjectPoolDemo {
    public static void main(String[] args) {
        CustomObjectPool objectPool = new CustomObjectPool();
        printObjPool(objectPool);
        var obj1 = objectPool.checkout();
        System.out.println("Checked out: " + obj1);
        printObjPool(objectPool);
        var obj2 = objectPool.checkout();
        System.out.println("Checked out: " + obj2);
        printObjPool(objectPool);
        var obj3 = objectPool.checkout();
        System.out.println("Checked out: " + obj3);
        printObjPool(objectPool);
        objectPool.checkIn(obj2);
        System.out.println("Checked in: " + obj2);
        printObjPool(objectPool);
        objectPool.checkIn(obj3);
        System.out.println("Checked in: " + obj3);
        printObjPool(objectPool);
        var obj4 = objectPool.checkout();
        System.out.println("Checked out: " + obj4);
        printObjPool(objectPool);
        var obj5 = objectPool.checkout();
        System.out.println("Checked out: " + obj5);
        printObjPool(objectPool);
    }

    private static void printObjPool(ObjectPool objectPool) {
        System.out.println(objectPool);
    }
}
