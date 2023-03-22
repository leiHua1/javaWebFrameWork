package personal.leihua.dao;



import personal.leihua.pojo.Dept;

import java.util.List;

public interface DeptDao {
    /*
    查询所有系的信息
     */
    public List<Dept> findAllDepts();

    /*
    根据id查询系部信息
     */
    public Dept findDeptById(String deptId);

    /*
    添加系部信息
     */
    public int addDept(Dept dept);

    /*
    修改系部信息
     */
    public int updateDept(Dept dept);

    /*
    根据id删除系部信息
     */
    public int deleteDeptById(String id);

}
