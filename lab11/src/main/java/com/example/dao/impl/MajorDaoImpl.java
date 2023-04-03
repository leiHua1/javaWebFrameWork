package com.example.dao.impl;

import com.example.dao.MajorDao;
import com.example.pojo.Major;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import javax.annotation.Resource;
import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/22 13:21
 */
@Repository("majorDao")
public class MajorDaoImpl implements MajorDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    //都是重复工作，其他的具体实现不写了
    @Override
    public List<Major> findAllMajor() {
        String sql = "select * from  tb_major";
        BeanPropertyRowMapper<Major> rowmapper = BeanPropertyRowMapper.newInstance(Major.class);
        return this.jdbcTemplate.query(sql, rowmapper);
    }
    @Override
    public int addMajor(Major major) {
        String sql = "insert into  tb_major values(?,?,?,null)";
        Object[] params=new Object[]{major.getMajorId(),
                major.getMajorName(),
                major.getTuition()};
        BeanPropertyRowMapper<Major> rowmapper = BeanPropertyRowMapper.newInstance(Major.class);
        return jdbcTemplate.update(sql,params);
    }

    @Override
    public int updateMajor(Major major) {
        return 0;
    }

    @Override
    public int deleteMajorById(String majorId) {
        return 0;
    }

    @Override
    public Major findMajorById(String majorId) {
        return null;
    }


}
