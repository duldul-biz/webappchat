package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TGoodsDao;
import com.bootdo.shop.domain.TGoodsDO;
import com.bootdo.shop.service.TGoodsService;



@Service
public class TGoodsServiceImpl implements TGoodsService {
	@Autowired
	private TGoodsDao tGoodsDao;
	
	@Override
	public TGoodsDO get(Long id){
		return tGoodsDao.get(id);
	}
	
	@Override
	public List<TGoodsDO> list(Map<String, Object> map){
		return tGoodsDao.list(map);
	}
	@Override
	public List<TGoodsDO> list1(Map<String, Object> map){
		return tGoodsDao.list1(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tGoodsDao.count(map);
	}
	
	@Override
	public int save(TGoodsDO tGoods){
		return tGoodsDao.save(tGoods);
	}
	
	@Override
	public int update(TGoodsDO tGoods){
		return tGoodsDao.update(tGoods);
	}
	
	@Override
	public int remove(Long id){
		return tGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tGoodsDao.batchRemove(ids);
	}
	
}
