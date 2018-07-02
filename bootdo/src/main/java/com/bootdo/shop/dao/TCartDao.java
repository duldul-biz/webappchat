package com.bootdo.shop.dao;

import com.bootdo.shop.domain.TCartDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-15 15:07:36
 */
@Mapper
public interface TCartDao {

	TCartDO get(Long id);
	
	List<TCartDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TCartDO tCart);
	
	int update(TCartDO tCart);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	List<TCartDO> batchGet(String[] ids);
}
