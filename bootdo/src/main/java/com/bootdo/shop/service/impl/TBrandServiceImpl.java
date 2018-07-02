package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TBrandDao;
import com.bootdo.shop.domain.TBrandDO;
import com.bootdo.shop.service.TBrandService;



@Service
public class TBrandServiceImpl implements TBrandService {
	@Autowired
	private TBrandDao tBrandDao;
	
	@Override
	public TBrandDO get(Long id){
		return tBrandDao.get(id);
	}
	
	@Override
	public List<TBrandDO> list(Map<String, Object> map){
		return tBrandDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tBrandDao.count(map);
	}
	
	@Override
	public int save(TBrandDO tBrand){
		return tBrandDao.save(tBrand);
	}
	
	@Override
	public int update(TBrandDO tBrand){
		return tBrandDao.update(tBrand);
	}
	
	@Override
	public int remove(Long id){
		return tBrandDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tBrandDao.batchRemove(ids);
	}
	
}
