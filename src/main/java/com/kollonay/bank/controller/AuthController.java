package com.kollonay.bank.controller;

import com.kollonay.bank.DTO.UserLoginDTO;
import com.kollonay.bank.DTO.UserRegisterDTO;
import com.kollonay.bank.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/user")
public class AuthController {

  private final UserService userService;


  @PostMapping("/register")
  public ResponseEntity<?> registerUser(@RequestBody @Valid UserRegisterDTO userRegisterDTO){
    userService.saveUser(userRegisterDTO);
    return ResponseEntity.ok().build();
  }

  public ResponseEntity<?> loginUser(@RequestBody @Valid UserLoginDTO userLoginDTO){
    if (userService.loginUser(userLoginDTO)){
      return ResponseEntity.ok().build();
    } else {
      return ResponseEntity.badRequest().build();
    }

  }
  //read

  //update

  //delete
}
