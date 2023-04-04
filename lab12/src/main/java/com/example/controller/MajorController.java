package com.example.controller;

import com.example.dao.MajorDao;
import com.example.pojo.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/4/4 11:45
 */
@Controller
public class MajorController {
    @Autowired
    MajorDao majorDao;

    @RequestMapping("/selectAllMajor")
    public String toShowAllMajor(HttpServletRequest request){
        List<Major> majorList =majorDao.findAllMajors();
        request.setAttribute("majorList",majorList);
        return "forward:/jsp/showAllMajors.jsp";
    }
    @RequestMapping("/toUpdateMajor")
    public String toUpdate(HttpServletRequest request,String id){
        Major major = majorDao.findMajorById(id);
        request.setAttribute("major",major);
        return "forward:/jsp/updateMajor.jsp";
    }
    @RequestMapping("/updateMajor")
    public String update(Major major){
        int i = majorDao.updateMajor(major);
        return "redirect:/selectAllMajor";
    }
}
