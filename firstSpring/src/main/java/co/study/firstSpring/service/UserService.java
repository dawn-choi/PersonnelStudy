package co.study.firstSpring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import co.study.firstSpring.domain.User;
import co.study.firstSpring.mapper.UserMapper;

@Service
public class UserService {
    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> list() {
        return userMapper.findAll();
    }
}
