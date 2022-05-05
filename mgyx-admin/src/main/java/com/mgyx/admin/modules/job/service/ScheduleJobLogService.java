package com.mgyx.admin.modules.job.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.mgyx.admin.modules.job.entity.ScheduleJobLogEntity;
import com.mgyx.admin.common.utils.PageUtils;

import java.util.Map;

/**
 * 定时任务日志
 *
 *
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
