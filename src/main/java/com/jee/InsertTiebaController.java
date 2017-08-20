package com.jee;

import com.jee.mapper.TieBaMapper;
import com.jee.po.TieBa;
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
public class InsertTiebaController {
    @Autowired
    private TieBaMapper tieBaMapper;
    @RequestMapping("/insertTieBa")
    @Transactional(isolation = Isolation.DEFAULT,
            propagation = Propagation.REQUIRED)
    public ModelAndView insertTieBa(HttpServletRequest request, HttpServletResponse response) throws Exception {
        TieBa tieba=new TieBa();
        tieba.setIntro("篮球爱好");
        tieba.setFollowers(0);
        tieba.setLogo("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502970757908&di=ff282314c7f463895a837e3b8a530b57&imgtype=0&src=http%3A%2F%2Fnews.chinaso.com%2Ffocus%2F201408%2FW020140814283269533187.jpg");
        tieba.setName("nba");
        tieba.setPostCount(0);

        tieBaMapper.insertTieba(tieba);
        ModelAndView model=new ModelAndView();
        return model;
    }




}
