package ru.pet.project.mapper;

import java.util.List;

public interface CommonMapper<V,T>{

    T toEntity(V v);
    V toDto(T t);
    List<T> toEntity (List<V> list);
    List<V> toDto (List<T> list);
}
