package com.zhangjun.guli.gulimallorder.dao;

import com.zhangjun.guli.gulimallorder.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-08-13 20:26:14
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
