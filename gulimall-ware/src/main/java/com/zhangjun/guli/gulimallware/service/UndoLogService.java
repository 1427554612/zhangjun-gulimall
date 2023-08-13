package com.zhangjun.guli.gulimallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhangjun.guli.common.utils.PageUtils;
import com.zhangjun.guli.gulimallware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhangjun
 * @email leifengyang@gmail.com
 * @date 2023-08-13 21:39:15
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

