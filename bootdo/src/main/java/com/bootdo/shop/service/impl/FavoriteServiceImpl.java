package com.bootdo.shop.service.impl;

import com.bootdo.common.utils.Query;
import com.bootdo.shop.domain.TCartDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.FavoriteDao;
import com.bootdo.shop.domain.FavoriteDO;
import com.bootdo.shop.service.FavoriteService;



@Service
public class FavoriteServiceImpl implements FavoriteService {
	@Autowired
	private FavoriteDao favoriteDao;
	
	@Override
	public FavoriteDO get(Long id){
		return favoriteDao.get(id);
	}
	
	@Override
	public List<FavoriteDO> list(Map<String, Object> map){
		return favoriteDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return favoriteDao.count(map);
	}
	
	@Override
	public int save(FavoriteDO favorite){
		return favoriteDao.save(favorite);
	}
	
	@Override
	public int update(FavoriteDO favorite){
		return favoriteDao.update(favorite);
	}
	
	@Override
	public int remove(Long id){
		return favoriteDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return favoriteDao.batchRemove(ids);
	}
	@Override
	public FavoriteDO selectOne(Map<String, Object> params) {
		List<FavoriteDO> list = favoriteDao.list(params);
		if (list!=null && list.size()>0){
			return  list.get(0);
		}
		return null;
	}

	@Override
	public List<FavoriteDO> userFavorite(Query query) {
		return favoriteDao.userFavorite(query);
	}
	@Override
	public List<FavoriteDO> userTopicFavorite(Query query) {
		return favoriteDao.userTopicFavorite(query);
	}
}
