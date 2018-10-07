package sky.ingen.englishchatter.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import sky.ingen.englishchatter.domain.User;

public interface UserRep extends JpaRepository<User, Long> {
}
