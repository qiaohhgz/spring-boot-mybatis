package com.yundian.mapper;

import com.yundian.entity.HelpCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelpCategoryMapper {
    List<HelpCategory> selectList();
}