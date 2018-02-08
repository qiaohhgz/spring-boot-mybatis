package com.example.mapper;

import com.example.model.HelpCategory;
import com.example.model.HelpCategoryForm;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HelpCategoryMapper {
    List<HelpCategory> selectList(HelpCategoryForm form);

    HelpCategory selectById(Integer id);
}