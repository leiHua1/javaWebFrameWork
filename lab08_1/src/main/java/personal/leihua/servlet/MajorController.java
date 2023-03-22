package personal.leihua.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import personal.leihua.dao.DeptDao;
import personal.leihua.dao.MajorDao;
import personal.leihua.dao.impl.DeptDaoImpl;
import personal.leihua.dao.impl.MajorDaoImpl;
import personal.leihua.pojo.Major;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/3/22 13:19
 */
@Controller("majorController")
public class MajorController {
    @Resource(name = "majorDao")
    MajorDao majorDao;

    public List<Major> findAllMajor() {
        System.out.println(majorDao);
        List<Major> allMajor = majorDao.findAllMajor();
      return allMajor;
    }
}
