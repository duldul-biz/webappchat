package com.bootdo.shop.service.impl;

import com.bootdo.common.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.CouponDao;
import com.bootdo.shop.domain.CouponDO;
import com.bootdo.shop.service.CouponService;



@Service
public class CouponServiceImpl implements CouponService {
	@Autowired
	private CouponDao couponDao;
	
	@Override
	public CouponDO get(Long id){
		return couponDao.get(id);
	}
	
	@Override
	public List<CouponDO> list(Map<String, Object> map){
		return couponDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return couponDao.count(map);
	}
	
	@Override
	public int save(CouponDO coupon){
		return couponDao.save(coupon);
	}
	
	@Override
	public int update(CouponDO coupon){
		return couponDao.update(coupon);
	}
	
	@Override
	public int remove(Long id){
		return couponDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return couponDao.batchRemove(ids);
	}

	@Override
	public List<CouponDO> userCoupon(Map<String, Object> map) {
		return couponDao.getUserCoupon(map);
	}

}
