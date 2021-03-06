package com.yonyou.cloud.ops.notify.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yonyou.cloud.ops.notify.entity.NotifyAppUrl;
import com.yonyou.cloud.ops.notify.entity.NotifyThirdMessage;

import tk.mybatis.mapper.common.Mapper;
/**
 * @author joy
 */
public interface NotifyAppUrlMapper extends Mapper<NotifyAppUrl> {
	
    public List<NotifyAppUrl> getAppUrl(@Param("appId")String appId);
}