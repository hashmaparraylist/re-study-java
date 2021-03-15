package io.github.ha.restudy.java.generic.web;

import io.github.ha.restudy.java.generic.entity.User;
import io.github.ha.restudy.java.generic.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController extends AbstractCrudController<UserService, User, Long> {
    public UserController(UserService service) {
        super(service);
    }
}
