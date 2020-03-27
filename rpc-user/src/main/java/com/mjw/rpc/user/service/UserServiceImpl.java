package com.mjw.rpc.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mjw.baseutil.business.entity.user.User;
import com.mjw.baseutil.utils.BeanUtils;
import com.mjw.rpc.user.mapper.UserMapper;
import com.mjw.user.dto.request.UserRequestDto;
import com.mjw.user.dto.response.UserResponseDto;
import com.mjw.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/27 20:05
 * @Version 1.0.0
 **/
@Service
public class UserServiceImpl implements UserService {


    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserResponseDto findUser(UserRequestDto userRequestDto) {

        logger.info(" support rpc [findUser] , requestDto = [{}]",userRequestDto);

        User user = userMapper.find(userRequestDto);
        UserResponseDto userResponseDto = new UserResponseDto();
        BeanUtils.copyProperties(user,userResponseDto);
        return userResponseDto;
    }

}
