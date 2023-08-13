package com.zhangjun.guli.gulimallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.gulimallmember.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-08-13 20:13:43
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

