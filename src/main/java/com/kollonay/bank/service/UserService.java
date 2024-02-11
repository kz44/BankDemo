package com.kollonay.bank.service;

import com.kollonay.bank.DTO.UserLoginDTO;
import com.kollonay.bank.DTO.UserRegisterDTO;
import com.kollonay.bank.model.User;

public interface UserService {
  void saveUser(UserRegisterDTO userRegisterDTO);

  boolean loginUser(UserLoginDTO userLoginDTO);
}
