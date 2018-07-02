package com.bootdo.shop.service;

import com.bootdo.shop.domain.TGoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-15 15:07:36
 */
public interface TGoodsService {
	
	TGoodsDO get(Long id);
	
	List<TGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(TGoodsDO tGoods);
	
	int update(TGoodsDO tGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

    List<TGoodsDO> list1(Map<String, Object> params);
}
