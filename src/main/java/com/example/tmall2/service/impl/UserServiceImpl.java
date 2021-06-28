package com.example.tmall2.service.impl;

import com.example.tmall2.model.UserDO;
import com.example.tmall2.repository.UserRepository;
import com.example.tmall2.service.UserService;
import com.example.tmall2.web.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserVO register(String loginName, String password) {

        UserDO registerUser = new UserDO();
        registerUser.setLoginName(loginName);
        registerUser.setNickName(loginName);

        //TODO
        registerUser.setIntroduceSign("no");
        // TODO MD5

        registerUser.setPasswordMd5(password);

        UserDO savedUser = userRepository.save(registerUser);

        //TODO
        UserVO userVO = new UserVO();
        userVO.setLoginName(registerUser.getLoginName());
        userVO.setNickName(registerUser.getNickName());
        userVO.setIntroduceSign(registerUser.getIntroduceSign());
        return userVO;
    }
}
