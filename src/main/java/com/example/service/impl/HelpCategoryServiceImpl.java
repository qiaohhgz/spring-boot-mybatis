package com.example.service.impl;

import com.example.model.HelpCategory;
import com.example.mapper.HelpCategoryMapper;
import com.example.model.HelpCategoryForm;
import com.example.service.HelpCategoryService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpCategoryServiceImpl implements HelpCategoryService {

    @Autowired
    private HelpCategoryMapper helpCategoryMapper;

    @Override
    public List<HelpCategory> selectList(HelpCategoryForm form) {
        PageHelper.startPage(form);
        return helpCategoryMapper.selectList(form);
    }

    @Override
    public HelpCategory selectById(Integer id) {
        return helpCategoryMapper.selectById(id);
    }
}
