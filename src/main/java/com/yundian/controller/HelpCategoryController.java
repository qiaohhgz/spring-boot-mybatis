package com.yundian.controller;

import com.yundian.common.Result;
import com.yundian.entity.HelpCategory;
import com.yundian.enums.Code;
import com.yundian.service.HelpCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("help")
public class HelpCategoryController {

    @Autowired
    private HelpCategoryService helpCategoryService;

    @RequestMapping(value = "category", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public Result category() {
        List<HelpCategory> list = helpCategoryService.selectList();
        return new Result<>(Code.SUCCESS, list);
    }
}
