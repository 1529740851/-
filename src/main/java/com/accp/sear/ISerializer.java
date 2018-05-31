package com.accp.sear;

public interface ISerializer {
    <T> byte[] serializer(T obj);

    <T> T deSerializer(byte[] data,Class<T> clazz);
}
