package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TGoodsClassDao;
import com.bootdo.shop.domain.TGoodsClassDO;
import com.bootdo.shop.service.TGoodsClassService;



@Service
public class TGoodsClassServiceImpl implements TGoodsClassService {
	@Autowired
	private TGoodsClassDao tGoodsClassDao;
	
	@Override
	public TGoodsClassDO get(Long id){
		return tGoodsClassDao.get(id);
	}
	
	@Override
	public List<TGoodsClassDO> list(Map<String, Object> map){
		return tGoodsClassDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tGoodsClassDao.count(map);
	}
	
	@Override
	public int save(TGoodsClassDO tGoodsClass){
		return tGoodsClassDao.save(tGoodsClass);
	}
	
	@Override
	public int update(TGoodsClassDO tGoodsClass){
		return tGoodsClassDao.update(tGoodsClass);
	}
	
	@Override
	public int remove(Long id){
		return tGoodsClassDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tGoodsClassDao.batchRemove(ids);
	}
	
}
