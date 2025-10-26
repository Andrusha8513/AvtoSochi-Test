package com.example.AvtoSochi_Test2;

import org.hibernate.validator.internal.util.privilegedactions.LoadClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users , Long> {
    Optional<Users> findByEmail(String email);
    Optional<Users> findByConfirmationCode(String code);
    List<Users>  findByEnabledIsFalseAndRegistrationDateBefore(LocalDateTime dateTime);
}
