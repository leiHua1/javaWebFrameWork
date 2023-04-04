package com.example.dao;
import java.util.List;
import com.example.pojo.Class;
public interface ClassDao {
    public int addClass(Class c);
    int updateClass(Class c);
    int deleteClassById(Integer classId);
    Class findClassById(Integer classId);
    List<Class> findAllClasses();
}
