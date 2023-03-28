package cn.edu.seig.service.impl;
import java.util.List;

import cn.edu.seig.dao.impl.ClassDaoImpl;
import cn.edu.seig.service.ClassService;
import cn.edu.seig.pojo.Class;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

//注解
@Service
@Transactional
public class ClassServiceImpl implements ClassService {

    //注解
	@Resource
	private ClassDaoImpl classDao;

	public ClassDaoImpl getClassDao() {
		return classDao;
	}

	public void setClassDao(ClassDaoImpl userdao) {
		this.classDao = userdao;
	}

	public int addClass(Class c) {
		// TODO Auto-generated method stub
		int n=this.classDao.addClass(c);
		return n;
	}
	public int updateClass(Class c) {
		return classDao.updateClass(c);
	}

	public int deleteClassById(Integer class_id) {
		return classDao.deleteClassById(class_id);
	}

	public List<Class> findClassByName(String ClassName) {
		List<Class> cs=classDao.findClassByName(ClassName);
		return cs;
	}

	public List<Class> findAllClassByDept(Integer deptId) {
		return classDao.findAllClassByDept(deptId);
	}


	public List<Class> findAllClassByMajor(Integer majorId) {
		return classDao.findAllClassByMajor(majorId);
	}


}
