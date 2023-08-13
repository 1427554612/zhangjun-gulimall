package com.zhangjun.guli.gulimallmember.dao;

import com.zhangjun.guli.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-08-13 20:13:43
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
