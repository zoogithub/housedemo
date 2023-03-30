package alimama.example.housedemo.service;

import alimama.example.housedemo.entity.User;

public interface UserService {
    public User findByUsername(String username);

    public boolean createUser(String username, String password);

    public boolean deleteByUsernameAndPwd(String username, String password);

    public boolean update(String username, String password);

    public boolean login(String username, String password);
}
