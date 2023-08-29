package com.zhangjun.guli.gulimallproduct.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 商品三级分类
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-04-28 22:45:26
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分类id
	 */
	@TableId
	private Long catId;
	/**
	 * 分类名称
	 */
	private String name;
	/**
	 * 父分类id
	 */
	private Long parentCid;
	/**
	 * 层级
	 */
	private Integer catLevel;
	/**
	 * 逻辑删除配置、当为1、显示、为0、不显示
	 */
	@TableLogic(value = "1",delval="0")
	private Integer showStatus;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 图标地址
	 */
	private String icon;
	/**
	 * 计量单位
	 */
	private String productUnit;
	/**
	 * 商品数量
	 */
	private Integer productCount;


	/**
	 * 子分类，注意。因为这个不是mysql表中的字段、而是实体类自己的属性
	 * 所以我们要加个注解@TableField(exist = false)来指定这个属性不是一个表字段
	 */
	@TableField(exist = false)
	private List<CategoryEntity> children;

}
