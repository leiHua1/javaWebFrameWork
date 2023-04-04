package com.example.annocationController;

import com.example.dao.MajorDao;
import com.example.pojo.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author leiHua
 * @Date 2023/4/4 09:36
 * 直接用注解方式
 */
@Controller
public class MyMajorController {
    @Autowired
    MajorDao majorDao;
    @RequestMapping("/myMajorForm")
    public  String toMajorForm(){
        return "myAdmin/majorForm";
    }
    @RequestMapping("/myAddMajor")
    public String toMajorInfo(HttpServletRequest request, Major major){
        majorDao.addMajor(major);
        request.setAttribute("major",major);
        return "forward:/myAdmin/majorInfo.jsp";
    }
}
