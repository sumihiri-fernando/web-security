package se.security.Web_Security.repository;

import org.springframework.data.repository.CrudRepository;
import se.security.Web_Security.model.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    public Optional<User> findUserByUsername(String username);
}