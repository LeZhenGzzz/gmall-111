package com.atguigu.ums.service.impl;

import com.atguigu.gmall.ums.entity.Admin;
import com.atguigu.gmall.ums.service.AdminService;
import com.atguigu.ums.mapper.AdminMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author datou
 * @since 2019-12-24
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
