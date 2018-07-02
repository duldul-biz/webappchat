package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TOrderLogDao;
import com.bootdo.shop.domain.TOrderLogDO;
import com.bootdo.shop.service.TOrderLogService;



@Service
public class TOrderLogServiceImpl implements TOrderLogService {
	@Autowired
	private TOrderLogDao tOrderLogDao;
	
	@Override
	public TOrderLogDO get(Long id){
		return tOrderLogDao.get(id);
	}
	
	@Override
	public List<TOrderLogDO> list(Map<String, Object> map){
		return tOrderLogDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tOrderLogDao.count(map);
	}
	
	@Override
	public int save(TOrderLogDO tOrderLog){
		return tOrderLogDao.save(tOrderLog);
	}
	
	@Override
	public int update(TOrderLogDO tOrderLog){
		return tOrderLogDao.update(tOrderLog);
	}
	
	@Override
	public int remove(Long id){
		return tOrderLogDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tOrderLogDao.batchRemove(ids);
	}
	
}
