package com.tanlei.springboot_jpa_crud.controller;

import com.tanlei.springboot_jpa_crud.pojo.User;
import com.tanlei.springboot_jpa_crud.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
       return "user/login";
    }

    @RequestMapping("/login")
    public String index(){
        logger.info("hello Sfl4j + logback......");
        return "redirect:/list";
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
