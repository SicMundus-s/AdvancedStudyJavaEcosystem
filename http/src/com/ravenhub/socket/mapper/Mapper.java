package com.ravenhub.socket.mapper;

public interface Mapper<F, T> {

    T mapFrom(F object);
}