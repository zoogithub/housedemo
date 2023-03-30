package alimama.example.housedemo.controller;

import alimama.example.housedemo.service.UserService;
import alimama.example.housedemo.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/dologin")
    @ResponseBody
    public JSONResult<Void> dologin(String username, String password) {
//        System.out.println(username);
//        System.out.println(password);
        JSONResult<Void> result = new JSONResult<>();
        if (userService.login(username, password)) {
            result.setState(2000);
            return result;
        } else {
            result.setState(4000);
            result.setMessage("用户名或密码错误，请重新登录");
            return result;
        }
    }

    @ResponseBody
    @RequestMapping("/regist")
    public JSONResult<Void> regist(String username, String password) {
        JSONResult<Void> result = new JSONResult<>();
        if (userService.findByUsername(username) != null) {
            result.setState(4000);
            result.setMessage("用户名已存在");
        } else {
            userService.createUser(username, password);
            result.setState(2000);
        }
        return result;
    }
}
