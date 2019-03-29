package com.mjw.rpc.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mjw.baseutil.utils.BeanUtils;
import com.mjw.rpc.user.mapper.UserMapper;
import com.mjw.rpc.user.model.UserModel;
import com.mjw.user.dto.request.UserRequestDto;
import com.mjw.user.dto.response.UserResponseDto;
import com.mjw.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/27 20:05
 * @Version 1.0.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserResponseDto findUser(UserRequestDto userRequestDto) {
        UserModel user = userMapper.find(userRequestDto);
        UserResponseDto userResponseDto = new UserResponseDto();
        BeanUtils.copyProperties(user,userResponseDto);
        return userResponseDto;
    }

}
