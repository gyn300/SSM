package com.jee.mapper;


import com.jee.po.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostMapper {



    /**
     * 获取所有贴子列表
     */
    List<Post> getPostList(long id);

    /**
     * 根据id返回指定贴子
     */
    Post getPost(long id);

    /**
     * 新增贴子
     */
    int insertPost(Post post);

    /**
     * 删除贴子
     */
    int deletePost(long id);
}
