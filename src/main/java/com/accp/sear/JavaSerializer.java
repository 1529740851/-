package com.accp.sear;

import java.io.*;

//基于java实现序列化
public class JavaSerializer  implements  ISerializer{
    public <T> byte[] serializer(T obj) {
        ObjectOutputStream objectOutputStream=null;
        try {
            objectOutputStream=new  ObjectOutputStream(new FileOutputStream(new File("user")));
            objectOutputStream.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(objectOutputStream!=null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return  null;
    }

    public <T> T deSerializer(byte[] data, Class<T> clazz) {
        ObjectInputStream objectInputStream=null;
        try {
            objectInputStream=new ObjectInputStream(new FileInputStream(new File("user")));
            return (T)objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
            if(objectInputStream!=null) objectInputStream.close(); }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
