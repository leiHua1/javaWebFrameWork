package cn.edu.seig.dao.impl;

import cn.edu.seig.dao.ClassDao;
import cn.edu.seig.pojo.Class;
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
    //添加注解

    /**
     * 添加系别
     */
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

    /**
     * 更新系别数据
     */
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

    /**
     * 删除系别
     */
    public int deleteClassById(Integer ClassId) {
        //定义SQL语句
        String sql = "delete from tb_class where class_id=?";
        //执行SQL，获取返回结果
        jdbcTemplate.update(sql, ClassId);
        return 0;
    }

    /**
     * 根据班级名称查询班级
     */
    public List<Class> findClassByName(String ClassName) {
        //定义SQL语句
        String sql = " select * from tb_class where class_name=?";
        //使用query()方法查询，返回单行记录
        BeanPropertyRowMapper<Class> rowmapper = BeanPropertyRowMapper.newInstance(Class.class);
        return jdbcTemplate.query(sql, rowmapper, ClassName);
    }

    /**
     * 查询某个系的所有班级
     *
     * @return
     */
    public List<Class> findAllClassByDept(Integer dept_id) {
        //定义SQL语句
        String sql = "select * from tb_class where dept_id=?";
	/*
	* 提供默认实现类 BeanPropertyRowMapper ， javabean属性和表的字段必须一致
	BeanPropertyRowMapper将结果集通过java的反射机制映射到java对象中
	 */
        BeanPropertyRowMapper<Class> rowmapper = BeanPropertyRowMapper.newInstance(Class.class);
        //使用query方法执行查询，并返回一个集合
        List<Class> list = jdbcTemplate.query(sql, rowmapper, dept_id);
        return list;
    }

    //查询某个专业的所有班级
    public List<Class> findAllClassByMajor(Integer majorId) {
        //定义SQL语句
        String sql = "select * from tb_class where class_id=?";
        //使用query方法执行查询，并返回一个集合
        List<Class> classes = jdbcTemplate.queryForList(sql, Class.class);
        return classes;
    }
}
