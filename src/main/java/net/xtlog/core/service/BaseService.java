/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package net.xtlog.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import net.xtlog.core.persistence.BaseEntity;

/**
 * Service基类
 * @author xtlog
 * @version 2017-05-16
 */
@Transactional(readOnly = true)
public abstract class BaseService {
	
	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());

	
	/**
	 * 数据范围过滤
	 * @param entity 当前过滤的实体类
	 */
	public static void dataRuleFilter(BaseEntity<?> entity) {


		
	}

}
