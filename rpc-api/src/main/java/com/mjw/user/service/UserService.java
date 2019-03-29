package com.mjw.user.service;

import com.mjw.user.dto.request.UserRequestDto;
import com.mjw.user.dto.response.UserResponseDto;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/27 20:04
 * @Version 1.0.0
 **/
public interface UserService {

    UserResponseDto findUser(UserRequestDto userRequestDto);

}
