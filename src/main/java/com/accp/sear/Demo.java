package com.accp.sear;

public class Demo {

    //序列化 也是种原型模式 深复制
    public static void main(String[] args) {
     //  JavaSerializer iSerializer=new JavaSerializer();
    //    JsonSerializer iSerializer=new JsonSerializer();
        ISerializer iSerializer=new XmlSerializer();
        User user=new User("张",10,"123");
        byte[] b=iSerializer.serializer(user);
        user.setHoddy("吃鱼");
        System.out.println(new String(b));
        User user1=iSerializer.deSerializer(b,User.class);

        System.out.println(user1.toString()+user1.getHoddy());

    }
}
