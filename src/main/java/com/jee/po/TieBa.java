package com.jee.po;

//`id` bigint not null auto_increment comment '贴吧id',
//`intro` varchar(150) comment '贴吧介绍',
//`logo` varchar(100) comment '贴吧logo',
//`name` varchar(150) not null comment '贴吧名字',
//`followers`  bigint default 0 comment '贴吧关注数',
//`post_count` bigint default 0 comment '贴吧帖子数',
//`create_time` timestamp not null default current_timestamp comment '创建时间',

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 贴吧
 */
public class TieBa {
    private long id;
    private String intro;
    private String logo;
    private String name;
    private long followers;
    private long postCount;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public TieBa() {
    }

    @Override
    public String toString() {
        return "TieBa{" +
                "id=" + id +
                ", intro='" + intro + '\'' +
                ", logo='" + logo + '\'' +
                ", name='" + name + '\'' +
                ", followers=" + followers +
                ", postCount=" + postCount +
                ", createTime=" + createTime +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getFollowers() {
        return followers;
    }

    public void setFollowers(long followers) {
        this.followers = followers;
    }

    public long getPostCount() {
        return postCount;
    }

    public void setPostCount(long postCount) {
        this.postCount = postCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
