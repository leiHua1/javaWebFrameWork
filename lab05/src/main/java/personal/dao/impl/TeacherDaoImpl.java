package personal.dao.impl;

import personal.dao.TeacherDao;
import personal.pojo.Teacher;

/**
 * @Author leiHua
 * @Date 2023/3/13 11:18
 */
public class TeacherDaoImpl implements TeacherDao {
    @Override
    public int insert() {
        System.out.println("新增一条教师记录成功");
        return 1;
    }

    @Override
    public int delelt() {
        System.out.println("删除一条教师记录成功");
        return 1;
    }

    @Override
    public int update() {
        System.out.println("更改一条教师记录成功");
        return 1;
    }

    @Override
    public Teacher selectById() {
        System.out.println("查询一条教师记录成功");
        Teacher teacher = new Teacher();
        teacher.setTeacherName("玛卡巴卡");
        teacher.setGender("1");
        teacher.setTel("12345678911");
        teacher.setRole("教师");
        teacher.setDeptId(6);
        return teacher;
    }
}
