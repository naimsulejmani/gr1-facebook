package dev.naimsulejmani.gr1facebook.mappers;

import dev.naimsulejmani.gr1facebook.dtos.UserDto;
import dev.naimsulejmani.gr1facebook.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper extends SimpleMapper<UserEntity, UserDto> {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
}
