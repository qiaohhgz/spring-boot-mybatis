package com.yundian.service.impl;

import com.yundian.entity.HelpCategory;
import com.yundian.mapper.HelpCategoryMapper;
import com.yundian.service.HelpCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpCategoryServiceImpl implements HelpCategoryService {

    @Autowired
    private HelpCategoryMapper helpCategoryMapper;

    @Override
    public List<HelpCategory> selectList() {
        return helpCategoryMapper.selectList();
    }
}
