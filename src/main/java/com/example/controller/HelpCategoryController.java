package com.example.controller;

import com.example.model.HelpCategory;
import com.example.model.HelpCategoryForm;
import com.example.service.HelpCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "帮助类别", description = "帮助类别")
@RestController
@RequestMapping("help/category")
public class HelpCategoryController {

    @Autowired
    private HelpCategoryService helpCategoryService;

    // 注意：GET 请求不支持 RequestBody 注解
    @ApiOperation("列表查询")
    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResponseEntity<List<HelpCategory>> list(@RequestBody HelpCategoryForm form) {
        List<HelpCategory> list = helpCategoryService.selectList(form);
        return ResponseEntity.ok(list);
    }

    @ApiOperation("详情查询")
    @ApiResponses({
            @ApiResponse(code = 404, message = "分类不存在", response = Void.class)
    })
    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ResponseEntity<HelpCategory> detail(@PathVariable("id") Integer id) {
        HelpCategory category = helpCategoryService.selectById(id);
        // 如果分类不存在返回编码 404
        if(category == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(category);
    }
}
