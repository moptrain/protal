package com.wizz.demo.Controller.AdminPage;

import com.wizz.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminHomePage {
    @RequestMapping("")
    public String  home(Model model,HttpServletRequest request){
//        User user = (User) request.getSession().getAttribute("currUser");
//        System.out.println(user.getName());
        model.addAttribute("msg","后端得到的数据");
        return ("adminpagehtml/index");
    };
    @RequestMapping("/user")
    public String manageInterface()
    {
        return "adminpagehtml/manage";
    }
}
