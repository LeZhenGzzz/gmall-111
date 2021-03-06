package com.atguigu.oms.service.impl;

import com.atguigu.gmall.oms.entity.Order;
import com.atguigu.gmall.oms.service.OrderService;
import com.atguigu.oms.mapper.OrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author datou
 * @since 2019-12-24
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
