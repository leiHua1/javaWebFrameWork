package cn.edu.seig.spring.service;

public interface StudentService {
	boolean save(String stuNumber, String stuName);
	boolean update(String stuNumber, String stuName);
	boolean delete(String stuNumber);
}
