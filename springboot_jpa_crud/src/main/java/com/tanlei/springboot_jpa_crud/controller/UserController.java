package com.tanlei.springboot_jpa_crud.controller;

import com.tanlei.springboot_jpa_crud.pojo.User;
import com.tanlei.springboot_jpa_crud.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-12-25 09:37
 */
@Controller
public class UserController {

    private  final  static Logger logger= LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    //登录页面
    @RequestMapping("/")
    public String login(){
       return "login/login";
    }


    //登录判断
    @RequestMapping("/login")
    public String index(HttpServletRequest request){
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        return "redirect:/list";

    }

    //注册
    @RequestMapping("/toRegister")
    public String register(){
        return "login/register";
    }

    //注册完成跳回登录页面
    @RequestMapping("/toAddAdmin")
    public String getAddAdmin(){
        return "login/login";
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<User> users=userService.getUserList();
        model.addAttribute("users", users);
        return "user/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,long id){
        User user=userService.findUserById(id);
        model.addAttribute("user", user);
        return "user/userEdit";
    }




}
