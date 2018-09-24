package com.atguigu.gmall0416.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
//基本属性表BaseAttrInfo  Serializable 序列化
public class BaseAttrInfo implements Serializable {

    // 获取主键自增atuo

    //获取主键自增auto
    //Column 数据库表的字段对应的属性值
    //JPA的@GeneratedValue注解,在JPA中,
    // @GeneratedValue注解存在的意义主要就是为一个实体生成一个唯一标识的主键
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;

    @Column
    private String attrName;
    @Column
    private String catalog3Id;

    @Transient//是避免序列化的  attrValueList属性值集合
    private List<BaseAttrValue> attrValueList;
    //基本属性值
    public List<BaseAttrValue> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList(List<BaseAttrValue> attrValueList) {
        this.attrValueList = attrValueList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id(String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }
}
