package com.xxxx.seckill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxxx.seckill.pojo.User;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  Mapper
 * </p>
 *
 * @author XC
 * @since 2022-06-09
 */
@Service
public interface UserMapper extends BaseMapper<User> {

}
