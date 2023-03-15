package cn.edu.seig.spring.service.impl;

import cn.edu.seig.spring.service.StudentService;

public class StudentServiceImpl implements StudentService {
	public void delete(String stuNumber) {
		System.out.println("学号是 " + stuNumber + " 的学生被删除");
	}

	public void save(String stuNumber, String stuName) {
		System.out.println("增加的学生学号是：" + stuNumber + ", 姓名是：" + stuName);
	}

	public void update(String stuNumber, String stuName) {
		System.out.println("修改的学生学号是：" + stuNumber + ", 修改后的姓名是：" + stuName);
	}

}
