package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TStoreDao;
import com.bootdo.shop.domain.TStoreDO;
import com.bootdo.shop.service.TStoreService;



@Service
public class TStoreServiceImpl implements TStoreService {
	@Autowired
	private TStoreDao tStoreDao;
	
	@Override
	public TStoreDO get(Long id){
		return tStoreDao.get(id);
	}
	
	@Override
	public List<TStoreDO> list(Map<String, Object> map){
		return tStoreDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tStoreDao.count(map);
	}
	
	@Override
	public int save(TStoreDO tStore){
		return tStoreDao.save(tStore);
	}
	
	@Override
	public int update(TStoreDO tStore){
		return tStoreDao.update(tStore);
	}
	
	@Override
	public int remove(Long id){
		return tStoreDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tStoreDao.batchRemove(ids);
	}
	
}
