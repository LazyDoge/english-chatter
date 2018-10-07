package sky.ingen.englishchatter.service;

import sky.ingen.englishchatter.domain.Message;
import sky.ingen.englishchatter.util.exception.NotFoundException;

import java.util.List;

public interface MessageService {

    Message create(Message message);

    void delete(long id) throws NotFoundException;

    Message get(long id) throws NotFoundException;

    void update(Message message);

    List<Message> getAll();

    List<Message> getAllFromUser(long userId);
}
