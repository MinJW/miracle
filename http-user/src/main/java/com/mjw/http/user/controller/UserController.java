package com.mjw.http.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mjw.baseutil.business.constant.UrlMappingConstants;
import com.mjw.baseutil.utils.BeanUtils;
import com.mjw.http.user.vo.request.UserRequestVo;
import com.mjw.http.user.vo.response.UserResponseVo;
import com.mjw.user.dto.request.UserRequestDto;
import com.mjw.user.dto.response.UserResponseDto;
import com.mjw.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/27 20:05
 * @Version 1.0.0
 **/
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Reference
    private UserService userService;

    @GetMapping(value = UrlMappingConstants.User.FIND_USER)
    public UserResponseVo find(UserRequestVo userRequestVo) {

        logger.info(" support request [/user/find] , param = [{}]", userRequestVo);

        UserRequestDto userRequestDto = new UserRequestDto();
        BeanUtils.copyProperties(userRequestVo, userRequestDto);
        UserResponseDto userResponseDto = userService.findUser(userRequestDto);

        UserResponseVo userResponseVo = new UserResponseVo();
        BeanUtils.copyProperties(userResponseDto, userResponseVo);

        return userResponseVo;
    }

}
