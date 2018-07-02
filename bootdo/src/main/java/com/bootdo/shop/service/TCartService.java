package com.bootdo.shop.service;

import com.bootdo.shop.domain.TCartDO;
import com.bootdo.shop.domain.TOrderDO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-15 15:07:36
 */
public interface TCartService {
	
	TCartDO get(Long id);
	
	List<TCartDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TCartDO tCart);
	
	int update(TCartDO tCart);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	TCartDO selectOne(Map<String, Object> params);

    Object selectOwnCart(Long id);

	Map<String, Object> ordersubmitpreview(Map<String, Object> params);

	TOrderDO orderSubmit(HttpServletRequest req);
}
