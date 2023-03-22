package personal.leihua.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import personal.leihua.dao.DeptDao;
import personal.leihua.pojo.Dept;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/22 11:58
 */
@Repository("deptDao")
public class DeptDaoImpl implements DeptDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Dept> findAllDepts() {
        String sql = "select * from  tb_dept";
        BeanPropertyRowMapper<Dept> rowmapper = BeanPropertyRowMapper.newInstance(Dept.class);
        return this.jdbcTemplate.query(sql, rowmapper);
    }

    @Override
    public Dept findDeptById(String deptId) {
        String sql = "select * from  tb_dept where dept_id=?";
        BeanPropertyRowMapper<Dept> rowmapper = BeanPropertyRowMapper.newInstance(Dept.class);
        return jdbcTemplate.queryForObject(sql, rowmapper, deptId);
    }

    @Override
    public int addDept(Dept dept) {
        String sql = "insert  into tb_dept  values(?,?) ";
        Object[] param = new Object[]{
                dept.getDeptId(),
                dept.getDeptName()};
        return  jdbcTemplate.update(sql,param);
    }

    @Override
    public int updateDept(Dept dept) {
        String sql = "update tb_dept set dept_name=? where dept_id=? ";
        Object[] param = new Object[]{
                dept.getDeptName(),
                dept.getDeptId()};
        return  jdbcTemplate.update(sql,param);
    }

    @Override
    public int deleteDeptById(String id) {
        String sql = "delete from tb_dept where dept_id=? ";
        return  jdbcTemplate.update(sql,id);
    }
}
