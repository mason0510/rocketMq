package com.example.rocketmqdemo.service.impl;

import com.example.rocketmqdemo.entity.User;
import com.example.rocketmqdemo.mapper.UserMapper;
import com.example.rocketmqdemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author authorxx
 * @since 2024-07-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
