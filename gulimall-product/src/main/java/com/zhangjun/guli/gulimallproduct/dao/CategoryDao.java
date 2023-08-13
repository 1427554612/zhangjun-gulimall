package com.zhangjun.guli.gulimallproduct.dao;

import com.zhangjun.guli.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-04-28 22:45:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
