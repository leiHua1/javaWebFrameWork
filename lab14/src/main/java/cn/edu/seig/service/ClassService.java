package cn.edu.seig.service;

import cn.edu.seig.pojo.Class;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author LH
* @description 针对表【tb_class】的数据库操作Service
* @createDate 2023-04-12 20:06:54
*/
public interface ClassService extends IService<Class> {
    List<Class> selectAll();

}
