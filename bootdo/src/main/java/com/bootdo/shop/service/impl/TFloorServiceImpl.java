package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TFloorDao;
import com.bootdo.shop.domain.TFloorDO;
import com.bootdo.shop.service.TFloorService;



@Service
public class TFloorServiceImpl implements TFloorService {
	@Autowired
	private TFloorDao tFloorDao;
	
	@Override
	public TFloorDO get(Long id){
		return tFloorDao.get(id);
	}
	
	@Override
	public List<TFloorDO> list(Map<String, Object> map){
		return tFloorDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tFloorDao.count(map);
	}
	
	@Override
	public int save(TFloorDO tFloor){
		return tFloorDao.save(tFloor);
	}
	
	@Override
	public int update(TFloorDO tFloor){
		return tFloorDao.update(tFloor);
	}
	
	@Override
	public int remove(Long id){
		return tFloorDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tFloorDao.batchRemove(ids);
	}
	
}
