package com.jee;

import com.jee.mapper.PostMapper;
import com.jee.po.Post;
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
public class InsertPostController {
    @Autowired
    private PostMapper postMapper;
    @RequestMapping("/insertPost")
    @Transactional(isolation = Isolation.DEFAULT,
            propagation = Propagation.REQUIRED)
    public ModelAndView insertPost(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Post post=new Post();
        post.setClicks(0);
        post.setContent("ffffffff");
        post.setPostUser("cc");
        post.setReplyUser("dqdq");
        post.setTiebaId(1);
        post.setTitle("aaaa");

        postMapper.insertPost(post);
        ModelAndView model=new ModelAndView();
        return model;
    }




}
