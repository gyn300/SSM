package com.jee.po;

//`id` bigint not null auto_increment comment '帖子id',
//`tieba_id` bigint not null comment '贴吧id',
//`clicks` bigint default 0 comment '点击次数',
//`title` varchar(150) not null comment '标题',
//`content` text comment '内容',
//`post_user` varchar(50) not null comment '发帖人',
//`reply_user` varchar(50) not null comment '回帖人',
//`last_reply_time` timestamp not null default current_timestamp comment '最后回复时间',
//`create_time` timestamp not null default current_timestamp comment '创建时间',

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 帖子
 */
public class Post {
    private long id;
    private long tiebaId;
    private long clicks;
    private String title;
    private String content;
    private String postUser;
    private String replyUser;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastReplyTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", tiebaId=" + tiebaId +
                ", clicks=" + clicks +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", postUser='" + postUser + '\'' +
                ", replyUser='" + replyUser + '\'' +
                ", lastReplyTime=" + lastReplyTime +
                ", createTime=" + createTime +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTiebaId() {
        return tiebaId;
    }

    public void setTiebaId(long tiebaId) {
        this.tiebaId = tiebaId;
    }

    public long getClicks() {
        return clicks;
    }

    public void setClicks(long clicks) {
        this.clicks = clicks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostUser() {
        return postUser;
    }

    public void setPostUser(String postUser) {
        this.postUser = postUser;
    }

    public String getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(String replyUser) {
        this.replyUser = replyUser;
    }

    public Date getLastReplyTime() {
        return lastReplyTime;
    }

    public void setLastReplyTime(Date lastReplyTime) {
        this.lastReplyTime = lastReplyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
