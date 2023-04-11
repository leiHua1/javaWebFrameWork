package cn.edu.seig.controller;

import cn.edu.seig.pojo.ReturnObject;
import cn.edu.seig.pojo.User;
import cn.edu.seig.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;

/**
 * @Author leiHua
 * @Date 2023/4/11 18:23
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    @ResponseBody
    public Object doLogin(User user, HttpSession session) {
        ReturnObject returnObject = new ReturnObject();
        if (user.getAccount() != null && user.getPassword() != null) {
            User user1 = userService.queryUserByAccount(user.getAccount());
            if (user1 != null) {
                if (user1.getPassword().equals(user.getPassword())) {
                    session.setAttribute("user", user1);
                    returnObject.setCode("1");
                    returnObject.setMessage("登录成功");
                    return returnObject;
                }
            }
        }
        returnObject.setCode("0");
        returnObject.setMessage("账号或密码错误");
        return returnObject;
    }

   @RequestMapping("/index")
    public String index(){
        return "index";
   }


}
