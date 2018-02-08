package com.example.service;

import com.example.model.HelpCategory;
import com.example.model.HelpCategoryForm;

import java.util.List;

public interface HelpCategoryService {
    List<HelpCategory> selectList(HelpCategoryForm form);

    HelpCategory selectById(Integer id);
}
