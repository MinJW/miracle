package com.mjw.rpc.user.mapper;

import com.mjw.baseutil.business.entity.user.User;
import com.mjw.user.dto.request.UserRequestDto;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description
 * @Author MinJunWen
 * @Data 2019/3/27 20:00
 * @Version 1.0.0
 **/
@Mapper
public interface UserMapper {

    /**
     * @Title
     * @Description
     * @param
     * @return com.mjw.rpc.user.bean.User
     * @throw
     * @author MinJunWen
     * @date 2019/3/27 20:03
     */
    User find(UserRequestDto user);

}
