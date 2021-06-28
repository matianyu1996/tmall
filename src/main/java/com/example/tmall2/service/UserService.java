package com.example.tmall2.service;

import com.example.tmall2.web.vo.UserVO;

public interface UserService {
    /**
     *
     * @param loginName
     * @param password
     * @return
     */
    UserVO register(String loginName, String password);
}
