package com.kollonay.bank.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisterDTO {

  private String firstName;
  private String lastName;
  private String username;
  private String email;
  private String password;
  private String age;
  private String gender;
}
