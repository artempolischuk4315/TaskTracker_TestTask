package com.ua.polishchuk.configuration.service.mapper;

public interface EntityMapper <E, D> {

    D mapEntityToDto(E entity);

    E mapDtoToEntity(D dto);
}
