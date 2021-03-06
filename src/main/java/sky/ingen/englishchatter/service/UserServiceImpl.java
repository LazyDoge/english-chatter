package sky.ingen.englishchatter.service;

import sky.ingen.englishchatter.domain.User;
import sky.ingen.englishchatter.rep.UserRep;
import sky.ingen.englishchatter.util.exception.NotFoundException;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRep userRep;

    public UserServiceImpl(UserRep userRep) {
        this.userRep = userRep;
    }

    @Override
    public User create(User user) {
        //this is example, your TODO is implement all other methods of this and MessageService
        return userRep.save(user);
    }

    @Override
    public void delete(long id) throws NotFoundException {

    }

    @Override
    public User get(long id) throws NotFoundException {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
