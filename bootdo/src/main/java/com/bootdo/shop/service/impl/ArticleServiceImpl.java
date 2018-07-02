package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.ArticleDao;
import com.bootdo.shop.domain.ArticleDO;
import com.bootdo.shop.service.ArticleService;



@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public ArticleDO get(Long id){
		return articleDao.get(id);
	}
	
	@Override
	public List<ArticleDO> list(Map<String, Object> map){
		return articleDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return articleDao.count(map);
	}
	
	@Override
	public int save(ArticleDO article){
		return articleDao.save(article);
	}
	
	@Override
	public int update(ArticleDO article){
		return articleDao.update(article);
	}
	
	@Override
	public int remove(Long id){
		return articleDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return articleDao.batchRemove(ids);
	}
	
}
