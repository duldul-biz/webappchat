package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TLinkDao;
import com.bootdo.shop.domain.TLinkDO;
import com.bootdo.shop.service.TLinkService;



@Service
public class TLinkServiceImpl implements TLinkService {
	@Autowired
	private TLinkDao tLinkDao;
	
	@Override
	public TLinkDO get(Integer id){
		return tLinkDao.get(id);
	}
	
	@Override
	public List<TLinkDO> list(Map<String, Object> map){
		return tLinkDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tLinkDao.count(map);
	}
	
	@Override
	public int save(TLinkDO tLink){
		return tLinkDao.save(tLink);
	}
	
	@Override
	public int update(TLinkDO tLink){
		return tLinkDao.update(tLink);
	}
	
	@Override
	public int remove(Integer id){
		return tLinkDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return tLinkDao.batchRemove(ids);
	}
	
}
