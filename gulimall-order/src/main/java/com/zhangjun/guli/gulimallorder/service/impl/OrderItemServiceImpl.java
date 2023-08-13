package com.zhangjun.guli.gulimallorder.service.impl;

import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zhangjun.guli.gulimallorder.dao.OrderItemDao;
import com.zhangjun.guli.gulimallorder.entity.OrderItemEntity;
import com.zhangjun.guli.gulimallorder.service.OrderItemService;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItemEntity> page = this.page(
                new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageUtils(page);
    }

}