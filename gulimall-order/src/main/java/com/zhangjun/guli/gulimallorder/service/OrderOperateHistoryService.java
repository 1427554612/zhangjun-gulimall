package com.zhangjun.guli.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.gulimallorder.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-08-13 20:26:14
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

