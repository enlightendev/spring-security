package com.enlightendev.spring.security.oauth.ex1.repository;

import com.enlightendev.spring.security.oauth.ex1.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByLogin(String login);
}
