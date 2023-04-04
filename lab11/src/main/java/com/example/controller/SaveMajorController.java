package com.example.controller;

import com.example.pojo.Major;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
// lab11_1
@WebServlet(name = "SaveMajorController", value = "/major_save")
public class SaveMajorController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String majorId = request.getParameter("majorId");
        String majorName = request.getParameter("majorName");
        String tuition = request.getParameter("tuition");
        Major major = new Major();
        major.setMajorId(majorId);
        major.setTuition(Integer.valueOf(tuition));
        major.setMajorName(majorName);
        request.setAttribute("major",major);
        request.getRequestDispatcher("/admin/majorInfo.jsp").forward(request,response);
    }
}
