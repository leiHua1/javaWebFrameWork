package personal.leihua.service;
import org.apache.ibatis.session.SqlSession;
import personal.leihua.mapper.FreshmanMapper;
import personal.leihua.pojo.Freshman;
import personal.leihua.utils.MybatisUtils;

import java.util.List;
import java.util.Map;

/**
 * @Author leiHua
 * @Date 2023/2/28 12:27
 */

public class FreshmanServiceImpl  implements FreshmanService{

    private FreshmanMapper freshmanMapper;
    public void setFreshmanMapper(){
        SqlSession session = MybatisUtils.getSession();
        FreshmanMapper mapper = session.getMapper(FreshmanMapper.class);
        this.freshmanMapper=mapper;
    }

    @Override
    public int addFreshMan(Freshman freshman) {
        if (freshmanMapper==null){
            setFreshmanMapper();
        }
        int result=freshmanMapper.addFreshman(freshman);
        return result;
    }

    @Override
    public List<Freshman> findAllFreshman() {
        if (freshmanMapper==null){
            setFreshmanMapper();
        }
        return freshmanMapper.findAllFreshmans();
    }

    @Override
    public int updateFreshman(Freshman freshman) {
        if (freshmanMapper==null){
            setFreshmanMapper();
        }
        return freshmanMapper.updateFreshman(freshman);
    }

    @Override
    public int deleteFreshman(Map<String, Object> param) {
        if (freshmanMapper==null){
            setFreshmanMapper();
        }
        return freshmanMapper.deleteFreshman(param);
    }
}
