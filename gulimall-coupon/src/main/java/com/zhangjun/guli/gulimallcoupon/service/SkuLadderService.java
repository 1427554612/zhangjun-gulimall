package com.zhangjun.guli.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.gulimallcoupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-08-13 19:56:51
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

