package com.pokio.ideabook.controller;


import com.pokio.ideabook.entity.sys.SysUser;
import com.pokio.ideabook.service.sys.SysUserService;
import com.pokio.ideabook.util.AjaxResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author llc
 * @since 2020-05-07
 */
@Api(tags = "用户")
@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "获取用户信息列表", notes = "获取用户信息列表")
    @GetMapping("/get")
    public AjaxResult getone(){
        return AjaxResult.success(sysUserService.list());
    }
}

