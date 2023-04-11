package cn.edu.seig.mapper;
import java.util.List;

import cn.edu.seig.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;


/**
* @author LH
* @description 针对表【tb_user】的数据库操作Mapper
* @createDate 2023-04-11 18:08:18
* @Entity cn.edu.seig.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {
    User selectOneByAccount(@Param("account") String account);
}




