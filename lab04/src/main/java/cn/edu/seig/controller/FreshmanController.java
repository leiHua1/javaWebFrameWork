package cn.edu.seig.controller;

import cn.edu.seig.service.FreshmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author leiHua
 * @Date 2023/3/8 12:22
 */
@Controller
public class FreshmanController {
    @Autowired
    FreshmanService freshmanService;


}
