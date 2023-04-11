package cn.edu.seig.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.seig.pojo.User;
import cn.edu.seig.service.UserService;
import cn.edu.seig.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author LH
* @description 针对表【tb_user】的数据库操作Service实现
* @createDate 2023-04-11 18:08:18
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User queryUserByAccount(String account) {
        return userMapper.selectOneByAccount(account);
    }
}




