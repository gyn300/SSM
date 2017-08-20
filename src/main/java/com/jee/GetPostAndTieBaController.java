package com.jee;

import com.jee.mapper.PostMapper;
import com.jee.mapper.TieBaMapper;
import com.jee.po.Post;
import com.jee.po.TieBa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class GetPostAndTieBaController {
    @Autowired
    private  PostMapper postMapper;
    @Autowired
    private  TieBaMapper tieBaMapper;

    @RequestMapping("/getPostAndTieBa")
    @Transactional(isolation = Isolation.DEFAULT,
            propagation = Propagation.REQUIRED)

    public ModelAndView getPostAndTieBa() throws Exception {

        List<Post> posts= postMapper.getPostList(1);
        ModelAndView model=new ModelAndView();
        TieBa tieBa=tieBaMapper.getTieBa(1);
        model.addObject("tieBa",tieBa);
        model.addObject("postList",posts);
        model.setViewName("nba.jsp");
        return model;
    }
}
