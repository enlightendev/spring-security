package io.enlightendev.oauthserver.repository;

import io.enlightendev.oauthserver.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByLogin(String login);
}
