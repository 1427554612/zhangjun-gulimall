package com.zhangjun.guli.gulimallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.common.utils.R;
import com.zhangjun.guli.gulimallproduct.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-04-28 22:45:26
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询出所有分类和子分类、用树结构组装起来
     */
    List<CategoryEntity> listWithTree();

    /**
     * 批量删除菜单
     */
    void removeMenusByIds(List<Long> asList);
}

