package com.zhangjun.guli.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.gulimallorder.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-08-13 20:26:14
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

