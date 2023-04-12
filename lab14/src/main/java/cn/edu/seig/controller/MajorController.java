package cn.edu.seig.controller;

import cn.edu.seig.dao.MajorDao;
import cn.edu.seig.pojo.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MajorController {
    @Autowired
    private MajorDao majorDao;

    /**
     * 跳转到majorForm.jsp
     * @return
     */
    @RequestMapping("/toAddMajor")
    public String toAddMajor(){
        return "addMajor";
    }

    /**
     * 添加专业，添加成功后挑战到/showAllMajors
     * @param major
     * @return
     */
    @RequestMapping("/addMajor")
    public String addMajor(Major major){
        int rows= majorDao.addMajor(major);

        return "redirect:findAllMajors";
    }

    /**
     * 查询所有专业信息，查询结果保存到Model,跳转到页面显示
     * @param model
     * @return
     */
    @RequestMapping("/findAllMajors")
    public String showAllMajors(Model model){
        List<Major> majorList=majorDao.findAllMajors();
        System.out.println(majorList);
        model.addAttribute("majorList",majorList);
        return "showAllMajors";
    }

    @RequestMapping("/toupdateMajor")
    public String toupdateMajor(String majorId, HttpServletRequest request){
        Major major = majorDao.findMajorById(majorId);
        request.setAttribute("major",major);
        return "showMajorDetails";
    }
    @RequestMapping("/updateMajor")
    public String updateMajor(Major major){
        int i = majorDao.updateMajor(major);
        return "redirect:findAllMajors";
    }

    @RequestMapping("/deleteMajor")
    public String deleteMajor(String majorId){
        int i = majorDao.deleteMajorById(majorId);
        return "redirect:findAllMajors";
    }

}
