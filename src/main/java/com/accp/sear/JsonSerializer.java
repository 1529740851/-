package com.accp.sear;

import com.alibaba.fastjson.JSON;

//Json序列化
public class JsonSerializer implements ISerializer{
    public <T> byte[] serializer(T obj) {
        return JSON.toJSONString(obj).getBytes();
    }

    public <T> T deSerializer(byte[] data, Class<T> clazz) {
        return JSON.parseObject(new String(data),clazz);
    }
}
