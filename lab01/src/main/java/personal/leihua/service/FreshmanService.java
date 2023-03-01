package personal.leihua.service;

import personal.leihua.pojo.Freshman;

import java.util.List;
import java.util.Map;

public interface FreshmanService {
        int addFreshMan(Freshman freshman);
        List<Freshman>  findAllFreshman();
        int updateFreshman(Freshman freshman);
        int deleteFreshman(Map<String, Object> param);

}
