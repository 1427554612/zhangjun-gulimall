package com.zhangjun.guli.gulimallcoupon.dao;

import com.zhangjun.guli.gulimallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-08-13 19:56:51
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
