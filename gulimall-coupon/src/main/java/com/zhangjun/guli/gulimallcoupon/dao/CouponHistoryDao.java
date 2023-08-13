package com.zhangjun.guli.gulimallcoupon.dao;

import com.zhangjun.guli.gulimallcoupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-08-13 19:56:52
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
