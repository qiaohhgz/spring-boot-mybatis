package com.example.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by qiaosj on 2018/2/8.
 */
public class HelpCategoryForm implements Serializable {
    // 查询条件
    @ApiModelProperty(value = "分类编号集合")
    private List<Integer> idList;
    @ApiModelProperty(value = "模糊查询分类名称")
    private String nameLike;
    @ApiModelProperty(value = "父类编号")
    private Integer parentId;
    // 分页
    @ApiModelProperty(value = "第几页", example = "1")
    private Integer pageNum;
    @ApiModelProperty(value = "显示行数", example = "10")
    private Integer pageSize;
    // 排序
    @ApiModelProperty(value = "排序", allowableValues = "help_category_id,name",
            notes = "(后面空格追加 升序ASC, 降序DESC), 例如: name asc 或者 name desc")
    private String orderBy;

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getPageSize() {
        return pageSize < 1 ? 10 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum < 1 ? 1 : pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return "HelpCategoryForm{" +
                "idList=" + idList +
                ", nameLike='" + nameLike + '\'' +
                ", parentId=" + parentId +
                ", orderBy='" + orderBy + '\'' +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }

}
