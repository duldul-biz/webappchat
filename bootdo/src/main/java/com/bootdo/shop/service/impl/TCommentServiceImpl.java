package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TCommentDao;
import com.bootdo.shop.domain.TCommentDO;
import com.bootdo.shop.service.TCommentService;



@Service
public class TCommentServiceImpl implements TCommentService {
	@Autowired
	private TCommentDao tCommentDao;
	
	@Override
	public TCommentDO get(Long id){
		return tCommentDao.get(id);
	}
	
	@Override
	public List<TCommentDO> list(Map<String, Object> map){
		return tCommentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tCommentDao.count(map);
	}
	
	@Override
	public int save(TCommentDO tComment){
		return tCommentDao.save(tComment);
	}
	
	@Override
	public int update(TCommentDO tComment){
		return tCommentDao.update(tComment);
	}
	
	@Override
	public int remove(Long id){
		return tCommentDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tCommentDao.batchRemove(ids);
	}
	
}
