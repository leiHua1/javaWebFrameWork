package cn.edu.seig.mapper;

import cn.edu.seig.pojo.Major;

import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/29 12:51
 */
public interface MajorMapper {
    //添加专业
    public int addMajor(Major major);

    //更新专业
    public int updateMajor(Major major);

    //删除专业
    public int deleteMajorById(String majorId);

    //根据id查询专业
    public Major findMajorById(String majorId);

    //查询所有专业
    public List<Major> findAllMajor();
}
