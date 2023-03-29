package cn.edu.seig.service;

import cn.edu.seig.pojo.Major;

import java.util.List;

public interface MajorService {
    public int addMajor(Major major);

    //更新专业
    public int updateMajor(Major major);

    //删除专业
    public int deleteMajorById(String majorId);

    //根据id查询专业
    public Major selectMajorById(String majorId);

    //查询所有专业
    public List<Major> selectAllMajor();
}
