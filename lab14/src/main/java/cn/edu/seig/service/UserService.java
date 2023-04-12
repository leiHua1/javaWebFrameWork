package cn.edu.seig.service;

import cn.edu.seig.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author LH
* @description 针对表【tb_user】的数据库操作Service
* @createDate 2023-04-11 18:08:18
*/
public interface UserService extends IService<User> {
  User queryUserByAccount(String account);

}
