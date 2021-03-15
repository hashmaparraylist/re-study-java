package io.github.ha.restudy.java.generic.service.impl;

import io.github.ha.restudy.java.generic.dao.UserDao;
import io.github.ha.restudy.java.generic.entity.User;
import io.github.ha.restudy.java.generic.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractCrudService<UserDao, User, Long> implements UserService {
    public UserServiceImpl(UserDao dao) {
        super(dao);
    }
}
