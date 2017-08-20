package com.jee;

import com.jee.mapper.UserMapper;
import com.jee.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @Autowired
    private  UserMapper userMapper;
    @RequestMapping("/getUser")
    @Transactional(isolation = Isolation.DEFAULT,
            propagation = Propagation.REQUIRED)
    public ModelAndView getUser(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String user_name=request.getParameter("user_name");
        String user_pwd=request.getParameter("user_pwd");
        User user=null;

        ModelAndView model=new ModelAndView();

        if(user_name!=null) {

            user = userMapper.getUser(user_name);

            if(user!=null){
                if(user.getUser_pwd().equals(user_pwd)) {
                model.addObject("user", user);
                model.setViewName("success.jsp");
                }else {
                    model.addObject("data", "账号密码错误");
                    model.setViewName("fail.jsp");
                }
            }else{
                model.addObject("data", "账号密码错误");
                model.setViewName("fail.jsp");
             }
        }

        return model;
    }


}
