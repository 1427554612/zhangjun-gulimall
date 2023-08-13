package com.zhangjun.guli.gulimallproduct.service.impl;

import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.common.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.zhangjun.guli.gulimallproduct.dao.AttrDao;
import com.zhangjun.guli.gulimallproduct.entity.AttrEntity;
import com.zhangjun.guli.gulimallproduct.service.AttrService;


@Service("attrService")
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<AttrEntity>()
        );

        return new PageUtils(page);
    }

}