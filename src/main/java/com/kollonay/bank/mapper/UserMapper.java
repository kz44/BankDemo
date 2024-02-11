package com.kollonay.bank.mapper;

import com.kollonay.bank.DTO.UserRegisterDTO;
import com.kollonay.bank.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

  /**
   * Converts an UserRegisterDTO into an User entity
   *
   * @param userRegisterDTO it contains the registration data
   * @return an User with the given parameters
   */
  public User toEntity (UserRegisterDTO userRegisterDTO){
   return User.builder()
       .firstName(userRegisterDTO.getFirstName())
       .lastName(userRegisterDTO.getLastName())
       .username(userRegisterDTO.getUsername())
       .email(userRegisterDTO.getEmail())
       .password(userRegisterDTO.getPassword())
       .age(userRegisterDTO.getAge())
       .gender(userRegisterDTO.getGender())
       .build();
  }

  /**
   * Converts an User into an UserRegisterDTO
   *
   * @param user it contains the data of the user
   * @return an UserRegisterDTO with the given data
   */
  public UserRegisterDTO toDto (User user){
    return UserRegisterDTO.builder()
        .firstName(user.getFirstName())
        .lastName(user.getLastName())
        .username(user.getUsername())
        .email(user.getEmail())
        .password(user.getPassword())
        .age(user.getAge())
        .gender(user.getGender())
        .build();
  }
}
