package com.gospel.data.collection.bilibili.pojo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/*
 *项目名: data-collection-bilibili
 *文件名: RoomRanking
 *创建者: SCH
 *创建时间:2019/6/3 17:41
 *描述: TODO
 */
@Data
@Entity
public class RoomRanking {
    @Id
    private long id;
    private String face;        //封面链接
    private String link;        //视频链接
    private int online;      //直播间人数
    private String roomid;      //直播间ID
    private String title;       //标题
    private String uname;       //用户名
    private Date created;       //获取时间
}
