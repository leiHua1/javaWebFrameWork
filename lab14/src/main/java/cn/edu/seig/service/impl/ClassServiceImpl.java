package cn.edu.seig.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.edu.seig.pojo.Class;
import cn.edu.seig.service.ClassService;
import cn.edu.seig.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author LH
* @description 针对表【tb_class】的数据库操作Service实现
* @createDate 2023-04-12 20:06:54
*/
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class>
    implements ClassService{
    @Autowired
    ClassMapper classMapper;


    @Override
    public List<Class> selectAll() {
        return classMapper.selectList(null);
    }
}




