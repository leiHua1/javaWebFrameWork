package cn.edu.seig.dao.impl;

import cn.edu.seig.dao.MajorDao;
import cn.edu.seig.pojo.Major;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/29 12:22
 */
public class MajorDaoImpl extends SqlSessionDaoSupport
        implements MajorDao {
    @Override
    public int addMajor(Major major) {
        return this.getSqlSession().update("cn.edu.seig.mapper.MajorMapper.addMajor",major);
    }

    @Override
    public int updateMajor(Major major) {
        return this.getSqlSession().update("cn.edu.seig.mapper.MajorMapper.updateMajor",major);
    }

    @Override
    public int deleteMajorById(String majorId) {
        return this.getSqlSession().delete("cn.edu.seig.mapper.MajorMapper.deleteMajorById",majorId);
    }

    @Override
    public Major findMajorById(String majorId) {
         return this.getSqlSession().selectOne("cn.edu.seig.mapper.MajorMapper.findMajorById", majorId);
    }

    @Override
    public List<Major> findAllMajor() {
        return this.getSqlSession().selectList("cn.edu.seig.mapper.MajorMapper.findAllMajor");
    }
}
