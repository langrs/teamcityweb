package com.lzm.si.service;

import com.lzm.si.dao.UserVO;

import java.util.List;


public interface UserService {
    public boolean check(String user);
    public List<UserVO> getAllUser();
    public void createUser(UserVO userVO);
    public UserVO getUser(String userNo);
}
