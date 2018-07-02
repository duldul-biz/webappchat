package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TFloorGoodsDao;
import com.bootdo.shop.domain.TFloorGoodsDO;
import com.bootdo.shop.service.TFloorGoodsService;



@Service
public class TFloorGoodsServiceImpl implements TFloorGoodsService {
	@Autowired
	private TFloorGoodsDao tFloorGoodsDao;
	
	@Override
	public TFloorGoodsDO get(Long id){
		return tFloorGoodsDao.get(id);
	}
	
	@Override
	public List<TFloorGoodsDO> list(Map<String, Object> map){
		return tFloorGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tFloorGoodsDao.count(map);
	}
	
	@Override
	public int save(TFloorGoodsDO tFloorGoods){
		return tFloorGoodsDao.save(tFloorGoods);
	}
	
	@Override
	public int update(TFloorGoodsDO tFloorGoods){
		return tFloorGoodsDao.update(tFloorGoods);
	}
	
	@Override
	public int remove(Long id){
		return tFloorGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tFloorGoodsDao.batchRemove(ids);
	}
	
}
