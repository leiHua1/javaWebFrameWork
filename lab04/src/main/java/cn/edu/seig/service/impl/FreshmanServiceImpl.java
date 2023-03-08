package cn.edu.seig.service.impl;

import cn.edu.seig.mapper.FreshmanMapper;
import cn.edu.seig.pojo.Freshman;
import cn.edu.seig.service.FreshmanService;
import cn.edu.seig.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class FreshmanServiceImpl implements FreshmanService {
     //1.通过工具类生成SqlSession对象
    SqlSession sqlSession = MybatisUtils.getSession();

    //2.实例化Mapper接口对象
    FreshmanMapper freshmanMapper=sqlSession.getMapper(FreshmanMapper.class);



    public Freshman getFreshmanLogin(String ticketnumber, String id_card) {
    return freshmanMapper.getFreshmanLogin(ticketnumber,id_card);
    }


    public List<Freshman> selectFreshmanByMultiple(Map<String, Object> params) {
       /* //创建Freshman对象的Map集合，封装需要组合查询的条件
        HashMap<String, Object> params = new HashMap<String, Object>();
        //params.put("ticketNumber", "");
        params.put("idCard", "445122199610045953");
        params.put("stuNo", "2040706101");*/
        //执行SqlSession的查询方法，返回结果集
        List<Freshman> f = freshmanMapper.selectFreshmanByMultiple(params);
        //打印输出结果
        for(Freshman ff:f)
            //打印输出结果
            System.out.println(ff.toString());
        return f;
    }


    public void addFreshman(Freshman f) {
        //sqlSession.commit(false);
        freshmanMapper.addFreshman(f);
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
        System.out.println("新生信息添加除成功！");
    }


    public void updateFreshman(Freshman f) {
        freshmanMapper.updateFreshman(f);
        sqlSession.commit();
        //关闭SqlSession
        sqlSession.close();
        //return rows;
        System.out.println("新生信息更新除成功！");
    }


    public void deleteFreshman(Map<String, Object> param) {
        freshmanMapper.deleteFreshman(param);
        sqlSession.commit();
        //关闭SqlSession
       sqlSession.close();
        System.out.println("新生信息删除成功！");
    }


    public List<Freshman> findFreshmanByDeptIdsAsArray(Integer[] ids) {
        return freshmanMapper.findFreshmanByDeptIdsAsArray(ids);
    }


    public List<Freshman> findFreshmanByDeptIdsAsList(List<Integer> ids) {
        return freshmanMapper.findFreshmanByDeptIdsAsList(ids);
    }


    public void setFreshmanMapper(FreshmanMapper freshmanMapper) {
        this.freshmanMapper = freshmanMapper;
    }
}
