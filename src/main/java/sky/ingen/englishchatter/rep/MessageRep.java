package sky.ingen.englishchatter.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import sky.ingen.englishchatter.domain.Message;

public interface MessageRep extends JpaRepository<Message, Long> {
}
