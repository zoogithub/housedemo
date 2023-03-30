package alimama.example.housedemo.mapper;

import alimama.example.housedemo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    public User findByUsername(String username);

    public void createUser(String username, String password);

    public void deleteByUsernameAndPwd(String username, String password);

    public void update(String username, String password);

    public User findByUsernameAndPwd(String username, String password);
}
