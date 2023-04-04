package com.example.dao.impl;

import com.example.dao.ClassDao;
import com.example.pojo.Class;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

//注解
@Repository
public class ClassDaoImpl implements ClassDao {

    //定义JdbcTemplate属性及其getter和setter方法
    @Resource
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public int addClass(Class c) {
        //定义SQL语句
        String sql = "insert into tb_class values(?,?,?,?,?,?,?,?,?)";
        //存放SQL语句的参数
        Object[] param = new Object[]{
                c.getClass_id(),
                c.getClass_name(),
                c.getClass_size(),
                c.getClass_surplus(),
                c.getDept_Id(),
                c.getMajor_id(),
                c.getTutor_id(),
                c.getInstructor_id(),
                c.getBz()};
        //执行SQL，获取返回结果
        return jdbcTemplate.update(sql, param);

    }

    public int updateClass(Class c) {
        //定义SQL语句
        String sql = "update tb_class set class_size=?,class_name=?,class_surplus=?,dept_id=?,major_id=?,tutor_id=?,instructor_id=?,bz=? where class_id=?";
        //存放SQL语句的参数
        Object[] param = new Object[]{
                c.getClass_size(),
                c.getClass_name(),
                c.getClass_surplus(),
                c.getDept_Id(),
                c.getMajor_id(),
                c.getTutor_id(),
                c.getInstructor_id(),
                c.getBz(),
                c.getClass_id()};
        //执行SQL，获取返回结果
        return jdbcTemplate.update(sql, param);
    }

    @Override
    public int deleteClassById(Integer classId) {
        //定义SQL语句
        String sql = "delete from tb_class where class_id=?";
        //执行SQL，获取返回结果
        return jdbcTemplate.update(sql, classId);
    }

    @Override
    public Class findClassById(Integer classId) {
        String sql = " select * from tb_class where class_id=?";
        //使用query()方法查询，返回单行记录
        BeanPropertyRowMapper<Class> rowmapper = BeanPropertyRowMapper.newInstance(Class.class);
        return jdbcTemplate.queryForObject(sql,rowmapper,classId);
    }

    @Override
    public List<Class> findAllClasses() {

        String sql = " select * from tb_class ";
        //使用query()方法查询，返回单行记录
        BeanPropertyRowMapper<Class> rowmapper = BeanPropertyRowMapper.newInstance(Class.class);
        return jdbcTemplate.query(sql,rowmapper);
    }
    //添加注解



}
