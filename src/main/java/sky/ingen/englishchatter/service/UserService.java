package sky.ingen.englishchatter.service;

import sky.ingen.englishchatter.domain.User;
import sky.ingen.englishchatter.util.exception.NotFoundException;

import java.util.List;

public interface UserService {

    User create(User user);

    void delete(long id) throws NotFoundException;

    User get(long id) throws NotFoundException;

    void update(User user);

    List<User> getAll();
}
