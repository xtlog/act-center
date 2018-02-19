/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package net.xtlog.act.mapper;

import net.xtlog.core.persistence.BaseMapper;
import net.xtlog.core.persistence.annotation.MyBatisMapper;
import net.xtlog.act.entity.Act;

/**
 * 审批Mapper接口
 * @author jeeplus
 * @version 2017-05-16
 */
@MyBatisMapper
public interface ActMapper extends BaseMapper<Act> {

	public int updateProcInsIdByBusinessId(Act act);
	
}
