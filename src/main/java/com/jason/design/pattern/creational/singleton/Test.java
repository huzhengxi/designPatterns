package com.jason.design.pattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Tiger.HU
 * @date 2021年10月08日 10:53 下午
 */
public class Test {

  public static void main(String[] args)
      throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Thread t1 = new Thread(new T());
    Thread t2 = new Thread(new T());
    t1.start();
    t2.start();
    System.out.println("program end");

//    HungrySingleton instance = HungrySingleton.getInstance();
//    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//    oos.writeObject(instance);
//
//    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton_file"));
//    HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//    System.out.println(newInstance);
//    System.out.println(instance);
//    System.out.println(newInstance == instance);

//    Class objectClass = HungrySingleton.class;
//    Constructor constructor = objectClass.getDeclaredConstructor();
//    constructor.setAccessible(true);
//    HungrySingleton instance = HungrySingleton.getInstance();
//    HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//
//    System.out.println(newInstance);
//    System.out.println(instance);
//    System.out.println(newInstance == instance);


//    Class objectClass = StaticInnerClassSingleton.class;
//    Constructor constructor = objectClass.getDeclaredConstructor();
//    constructor.setAccessible(true);
//    StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//    StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
//
//    System.out.println(newInstance);
//    System.out.println(instance);
//    System.out.println(newInstance == instance);

//    EnumInstance instance = EnumInstance.getInstance();
//    instance.printTest();
  }

}
