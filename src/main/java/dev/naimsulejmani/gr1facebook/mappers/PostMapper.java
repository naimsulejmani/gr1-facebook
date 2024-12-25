package dev.naimsulejmani.gr1facebook.mappers;

import dev.naimsulejmani.gr1facebook.dtos.ListingPostDto;
import dev.naimsulejmani.gr1facebook.dtos.PostDto;
import dev.naimsulejmani.gr1facebook.entities.PostEntity;
import dev.naimsulejmani.gr1facebook.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Primary;

@Primary
@Mapper(componentModel = "spring")
public interface PostMapper extends SimpleMapper<PostEntity, PostDto> {
    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(source = "userId", target = "userEntity.id")
    PostEntity toPostEntity(PostDto postDto);

    @Mapping(source = "userEntity.id", target = "userId")
    PostDto toPostDto(PostEntity postEntity);
//
//
    @Mapping(source = "userEntity.id", target = "userId")
    @Mapping(source = "createdAt", target = "postedAt")
    @Mapping(source = "userEntity", target = "fullName", qualifiedByName = "fullName")
    @Mapping(source = "createdAt", target = "postedAgo", qualifiedByName = "timeAgo")
    ListingPostDto toListingPostDto(PostEntity postEntity);
//
    @Named("fullName")
    default String fullName(UserEntity userEntity) {
        return "";
    }
//
    @Named("timeAgo")
    default String timeAgo(PostEntity postEntity) {
        // use Period to find how many minutes, hourse, seconds has passed
        // between postEntity.getCreatedAt() and now

        return postEntity.getCreatedAt().toString();
    }
}











