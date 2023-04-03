package com.example.controller;

import com.example.dao.MajorDao;
import com.example.pojo.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author leiHua
 * @Date 2023/4/3 21:00
 */
@WebServlet("/major_save02")
public class SaveMajorController02 extends HttpServlet {

    static MajorDao majorDao;
    static {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-druid.xml");
        majorDao = context.getBean("majorDao", MajorDao.class);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String majorId = request.getParameter("majorId");
        String majorName = request.getParameter("majorName");
        String tuition = request.getParameter("tuition");
        Major major = new Major();
        major.setMajorId(majorId);
        major.setTuition(Integer.valueOf(tuition));
        major.setMajorName(majorName);

        // 写入数据库
        majorDao.addMajor(major);
        request.setAttribute("major",major);
        request.getRequestDispatcher("/admin02/majorInfo.jsp").forward(request,response);

    }
}
