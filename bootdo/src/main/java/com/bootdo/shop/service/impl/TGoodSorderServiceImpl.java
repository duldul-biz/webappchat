package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TGoodSorderDao;
import com.bootdo.shop.domain.TGoodSorderDO;
import com.bootdo.shop.service.TGoodSorderService;



@Service
public class TGoodSorderServiceImpl implements TGoodSorderService {
	@Autowired
	private TGoodSorderDao tGoodSorderDao;
	
	@Override
	public TGoodSorderDO get(Long id){
		return tGoodSorderDao.get(id);
	}
	
	@Override
	public List<TGoodSorderDO> list(Map<String, Object> map){
		return tGoodSorderDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tGoodSorderDao.count(map);
	}
	
	@Override
	public int save(TGoodSorderDO tGoodSorder){
		return tGoodSorderDao.save(tGoodSorder);
	}
	
	@Override
	public int update(TGoodSorderDO tGoodSorder){
		return tGoodSorderDao.update(tGoodSorder);
	}
	
	@Override
	public int remove(Long id){
		return tGoodSorderDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tGoodSorderDao.batchRemove(ids);
	}
	
}
