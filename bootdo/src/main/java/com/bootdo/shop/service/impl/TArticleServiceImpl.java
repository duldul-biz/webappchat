package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TArticleDao;
import com.bootdo.shop.domain.TArticleDO;
import com.bootdo.shop.service.TArticleService;



@Service
public class TArticleServiceImpl implements TArticleService {
	@Autowired
	private TArticleDao tArticleDao;
	
	@Override
	public TArticleDO get(Long id){
		return tArticleDao.get(id);
	}
	
	@Override
	public List<TArticleDO> list(Map<String, Object> map){
		return tArticleDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tArticleDao.count(map);
	}
	
	@Override
	public int save(TArticleDO tArticle){
		return tArticleDao.save(tArticle);
	}
	
	@Override
	public int update(TArticleDO tArticle){
		return tArticleDao.update(tArticle);
	}
	
	@Override
	public int remove(Long id){
		return tArticleDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tArticleDao.batchRemove(ids);
	}
	
}
