package com.kollonay.bank.repository;

import com.kollonay.bank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
  // @Query("SELECT us FROM users us WHERE (:us.username = :givenUsername)")
  User findByUsername(@Param("givenUsername") String givenUsername);
}
