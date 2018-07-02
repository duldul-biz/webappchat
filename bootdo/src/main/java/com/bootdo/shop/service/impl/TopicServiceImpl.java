package com.bootdo.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TopicDao;
import com.bootdo.shop.domain.TopicDO;
import com.bootdo.shop.service.TopicService;



@Service
public class TopicServiceImpl implements TopicService {
	@Autowired
	private TopicDao topicDao;
	
	@Override
	public TopicDO get(Long id){
		return topicDao.get(id);
	}
	
	@Override
	public List<TopicDO> list(Map<String, Object> map){
		return topicDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return topicDao.count(map);
	}
	
	@Override
	public int save(TopicDO topic){
		return topicDao.save(topic);
	}
	
	@Override
	public int update(TopicDO topic){
		return topicDao.update(topic);
	}
	
	@Override
	public int remove(Long id){
		return topicDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return topicDao.batchRemove(ids);
	}
	
}
