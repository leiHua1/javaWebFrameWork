package cn.edu.seig.controller;

import cn.edu.seig.service.ClassService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import cn.edu.seig.pojo.Class;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author leiHua
 * @Date 2023/4/12 20:01
 */
@Controller
public class ClassController {
    @Autowired
    ClassService classService;

    @GetMapping("/findAllClass")
    public String toShowAllClass(HttpServletRequest request) {
        List<Class> classList = classService.selectAll();
        request.setAttribute("classList", classList);
        return "showAllClass";
    }

    @GetMapping("/deleteClass")
    public String deleteClassById(Integer classId) {
        QueryWrapper<Class> classQueryWrapper = new QueryWrapper<>();
        classQueryWrapper.eq("class_id", classId);
        boolean result = classService.remove(classQueryWrapper);
        System.out.println(result);
        return "redirect:findAllClass";
    }

    @GetMapping("/toAddClass")
    public String toAddClass() {
        return "addClass";
    }

    @PostMapping("/addClass")
    public String addClass(Class clazz) {
        boolean result = classService.save(clazz);
        System.out.println(result == true ? "添加成功" : "添加失败");
        return "redirect:findAllClass";
    }

    @GetMapping("/toEditClass")
    public String toEditClass(Integer classId, HttpServletRequest request) {
        Class clazz = classService.query().eq("class_id", classId).one();
        request.setAttribute("clazz", clazz);
        return "eidtClass";
    }
    @PostMapping("/editClass")
    public String editClass(Class clazz){
        classService.updateById(clazz);
        return "redirect:findAllClass";
    }

}
