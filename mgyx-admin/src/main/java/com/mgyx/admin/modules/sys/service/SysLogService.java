package com.mgyx.admin.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.mgyx.admin.common.utils.PageUtils;
import com.mgyx.admin.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * 
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

    boolean save(SysLogEntity sysLog);
}
