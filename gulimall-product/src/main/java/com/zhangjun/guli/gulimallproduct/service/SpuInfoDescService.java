package com.zhangjun.guli.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.common.utils.R;
import com.zhangjun.guli.gulimallproduct.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-04-28 22:45:25
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

