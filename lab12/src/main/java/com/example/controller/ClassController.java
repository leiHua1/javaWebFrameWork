package com.example.controller;

import com.example.dao.ClassDao;
import com.example.pojo.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/4/4 13:41
 */
@Controller
public class ClassController {
    @Autowired
    ClassDao classDao;
    @RequestMapping("/allClass")
    public String toShowClass(HttpServletRequest request){
        List<Class> classList = classDao.findAllClasses();
        request.setAttribute("classList",classList);
        return "forward:jsp/showAllClasses.jsp";
    }

    @RequestMapping("/toUpdateClass")
    public String toupdateClass(HttpServletRequest request,Integer id){
        Class clazz = classDao.findClassById(id);
        request.setAttribute("clazz",clazz);
        return "forward:jsp/updateClass.jsp";
    }
    @RequestMapping("/updateClass")
    public String updateClass(Class clazz){
        classDao.updateClass(clazz);
        System.out.println(clazz.toString());
        return "redirect:allClass";
    }
    @RequestMapping("/addClass")
    public String allClass(Class clazz){
        classDao.addClass(clazz);
        return "redirect:allClass";
    }
}
