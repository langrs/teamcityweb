package com.lzm.si.service.impl;

import com.lzm.si.dao.UserVO;
import com.lzm.si.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    public boolean check(String user) {
        if (user == null){
            return false;
        }else{
            return true;
        }
    }

    public List<UserVO> getAllUser() {
        List<UserVO> list = new ArrayList<UserVO>();
        UserVO userVO = new UserVO();
        userVO.setUserNo("001");
        userVO.setUserName("lzm");
        userVO.setAge(10);
        list.add(userVO);
        return list;
    }

    public void createUser(UserVO userVO) {

    }

    public UserVO getUser(String userNo) {
        UserVO userVO = new UserVO();
        userVO.setUserNo("001");
        userVO.setUserName("lzm");
        userVO.setAge(10);
        return userVO;
    }
}
