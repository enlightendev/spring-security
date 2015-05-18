package com.enlightendev.spring.stateless.security.repository;

import com.enlightendev.spring.stateless.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
