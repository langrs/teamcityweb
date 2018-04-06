package com.lzm.si.controller;

import com.lzm.si.dao.UserVO;
import com.lzm.si.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
@Controller
@RequestMapping(value = "User/")
public class UserController {
    @Resource
    UserService userService;

    @RequestMapping(method = RequestMethod.GET,value = "list.do")
    @ResponseBody
    public UserVO getList(){
        UserVO userVO = userService.getUser("");
        System.out.println("this is result:" + userVO.toString());
        return userVO;
//        return "/UserInfo";
    }
}
