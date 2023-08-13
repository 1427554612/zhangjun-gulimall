package com.zhangjun.guli.gulimallproduct.service.impl;

import com.zhangjun.guli.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.common.utils.R;

import com.zhangjun.guli.gulimallproduct.dao.CategoryDao;
import com.zhangjun.guli.gulimallproduct.entity.CategoryEntity;
import com.zhangjun.guli.gulimallproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }


    /**
     * 查询出所有分类和子分类、用树结构组装起来
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 查询所有分类
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);

        // 查询所有一级分类
        List<CategoryEntity> level1Category = categoryEntities
                .stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(menu->{
                    menu.setChildren(getChilrdens(menu,categoryEntities));
                    return menu;
                })
                .sorted((menu1,menu2)->{
                    return (menu1.getSort()==null?0:menu1.getSort()) -(menu2.getSort()==0?0:menu2.getSort());
                })
                .collect(Collectors.toList());
        return level1Category;
    }

    /**
     * 递归查找所有当前菜单的子菜单
     * @param entity：当前菜单
     * @param list：所有菜单
     * @return
     */
    private List<CategoryEntity> getChilrdens(CategoryEntity entity,List<CategoryEntity> list) {
        List<CategoryEntity> children = list.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == entity.getCatId();
        }).map(menu -> {
            menu.setChildren(getChilrdens(menu, list));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort()) -(menu2.getSort()==0?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}