package cn.edu.seig.service.impl;

import cn.edu.seig.mapper.MajorMapper;
import cn.edu.seig.pojo.Major;
import cn.edu.seig.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/29 13:57
 */
@Service
@Transactional
public class MajorServiceImpl implements MajorService {
    @Autowired
    MajorMapper mapper;
    @Override
    public int addMajor(Major major) {
        int result = mapper.addMajor(major);
        // 模拟报错
        System.out.println(1/0);
        return result;
    }

    @Override
    public int updateMajor(Major major) {
        return mapper.updateMajor(major);
    }

    @Override
    public int deleteMajorById(String majorId) {
        return mapper.deleteMajorById(majorId);
    }

    @Override
    public Major selectMajorById(String majorId) {
        return mapper.findMajorById(majorId);
    }

    @Override
    public List<Major> selectAllMajor() {
        return mapper.findAllMajor();
    }
}
