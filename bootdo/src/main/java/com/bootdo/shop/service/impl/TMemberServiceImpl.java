package com.bootdo.shop.service.impl;

import com.bootdo.common.utils.MD5Utils;
import com.bootdo.shop.domain.TCartDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootdo.shop.dao.TMemberDao;
import com.bootdo.shop.domain.TMemberDO;
import com.bootdo.shop.service.TMemberService;



@Service
public class TMemberServiceImpl implements TMemberService {
	@Autowired
	private TMemberDao tMemberDao;
	
	@Override
	public TMemberDO get(Long id){
		return tMemberDao.get(id);
	}
	
	@Override
	public List<TMemberDO> list(Map<String, Object> map){
		return tMemberDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return tMemberDao.count(map);
	}
	
	@Override
	public int save(TMemberDO tMember){
		return tMemberDao.save(tMember);
	}
	
	@Override
	public int update(TMemberDO tMember){
		return tMemberDao.update(tMember);
	}
	
	@Override
	public int remove(Long id){
		return tMemberDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return tMemberDao.batchRemove(ids);
	}

	@Override
	public TMemberDO checkUser(String username, String password) {
		String secPwd = MD5Utils.encrypt(password, username);
		Map<String, Object> params = new HashMap<>();
		params.put("username",username);
		params.put("password",secPwd);
		params.put("status",1);
		TMemberDO users = this.selectOne(params);
		if(users != null) {
			return users;
		}
		return null;
	}

	@Override
	public TMemberDO selectOne(Map<String, Object> params) {
		List<TMemberDO> list = tMemberDao.list(params);
		if (list!=null && list.size()>0){
			return  list.get(0);
		}
		return null;
	}
}
