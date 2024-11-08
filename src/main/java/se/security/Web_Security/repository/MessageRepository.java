package se.security.Web_Security.repository;

import org.springframework.data.repository.CrudRepository;
import se.security.Web_Security.model.Message;

public interface MessageRepository extends CrudRepository<Message, String> {

}
