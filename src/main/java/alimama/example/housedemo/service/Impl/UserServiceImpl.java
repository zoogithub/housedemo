package alimama.example.housedemo.service.Impl;

import alimama.example.housedemo.entity.User;
import alimama.example.housedemo.mapper.UserMapper;
import alimama.example.housedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private static Map<String,User> cache=new HashMap<>();
    @Autowired
    UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        User userofCache=cache.get(username);
        if(userofCache!=null){
            return userofCache;
        }
        User userofDB=userMapper.findByUsername(username);
        if(userofDB!=null){
            cache.put(username,userofDB);
        }
        return userofDB;
    }

    //创建用户，如果用户名相同，则返回false，表示创建失败；如果用户名不同，则返回true
    @Override
    public boolean createUser(String username, String password) {
        if(cache.get(username)==null){
            User userofDB = userMapper.findByUsername(username);
            if (userofDB == null || !userofDB.getUsername().equals(username)) {
                userMapper.createUser(username, password);
                cache.put(username,userofDB);
                return true;
            }
        }
        return false;
    }

    //删除用户，成功：true 失败：false
    @Override
    public boolean deleteByUsernameAndPwd(String username, String password) {
        User userofDB = userMapper.findByUsernameAndPwd(username, password);
        if (userofDB.getUsername().equals(username) && userofDB.getPassword().equals(password)) {
            userMapper.deleteByUsernameAndPwd(username, password);
            cache.remove(username);
            return true;
        } else {
            return false;
        }
    }

    //更新 成功：true 失败：false
    @Override
    public boolean update(String username, String password) {
        User userofDB = userMapper.findByUsername(username);
        if (userofDB != null) {
            userMapper.update(username, password);
            userofDB.setPassword(password);
            cache.replace(username,userofDB);
            return true;
        } else {
            return false;
        }

    }

    //登录 成功：true 失败：false
    @Override
    public boolean login(String username, String password) {
        User userofCache=cache.get(username);
        if (userofCache!=null){
            return userofCache.getPassword().equals(password);
        }
        else {
            User userofDB = userMapper.findByUsernameAndPwd(username, password);
            return userofDB != null;
        }
    }
}
