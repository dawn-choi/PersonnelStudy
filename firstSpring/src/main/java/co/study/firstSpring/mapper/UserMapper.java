package co.study.firstSpring.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import co.study.firstSpring.domain.User;

@Mapper
public interface UserMapper{
    List<User> findAll();
}

