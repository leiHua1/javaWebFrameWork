package personal.dao;

import personal.pojo.Teacher;

/**
 * @Author leiHua
 * @Date 2023/3/13 11:18
 */
public interface TeacherDao {
    public int insert();
    public int delelt();
    int update();
    Teacher selectById();
}
