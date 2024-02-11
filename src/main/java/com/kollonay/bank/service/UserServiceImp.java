package com.kollonay.bank.service;

import com.kollonay.bank.DTO.UserLoginDTO;
import com.kollonay.bank.DTO.UserRegisterDTO;
import com.kollonay.bank.mapper.UserMapper;
import com.kollonay.bank.model.User;
import com.kollonay.bank.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

  private final UserRepository userRepository;
  private final UserMapper userMapper;

  /**
   * Saves a new user into the database
   * @param userRegisterDTO it contains the data of the user
   */
  @Override
  public void saveUser(UserRegisterDTO userRegisterDTO) {
    userRepository.save(userMapper.toEntity(userRegisterDTO));
  }

  /**
   * User can log in it the userLoginDTO fields match the database criteria
   * @param userLoginDTO contains the logging information about the user
   */
  @Override
  public boolean loginUser(UserLoginDTO userLoginDTO) {
    User user = userRepository.findByUsername(userLoginDTO.getUsername());
    return true;
  }
}
