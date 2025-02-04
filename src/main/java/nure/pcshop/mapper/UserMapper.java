package nure.pcshop.mapper;

import nure.pcshop.config.MapperConfig;
import nure.pcshop.dto.UserRegistrationDto;
import nure.pcshop.dto.UserResponseDto;
import nure.pcshop.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    UserResponseDto toDto(User user);
    @Mapping(target = "password", source = "password")
    User toModel(UserRegistrationDto registrationDto);
}
