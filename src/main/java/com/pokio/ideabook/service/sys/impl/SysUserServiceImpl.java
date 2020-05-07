package com.pokio.ideabook.service.sys.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pokio.ideabook.entity.sys.SysUser;
import com.pokio.ideabook.mapper.sys.SysUserMapper;
import com.pokio.ideabook.service.sys.SysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author llc
 * @since 2020-05-07
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
