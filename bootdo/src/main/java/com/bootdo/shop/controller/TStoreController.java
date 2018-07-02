package com.bootdo.shop.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.shop.domain.TStoreDO;
import com.bootdo.shop.service.TStoreService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-15 15:07:37
 */
 
@Controller
@RequestMapping("/shop/tStore")
public class TStoreController {
	@Autowired
	private TStoreService tStoreService;
	
	@GetMapping()
	@RequiresPermissions("shop:tStore:tStore")
	String TStore(){
	    return "shop/tStore/tStore";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:tStore:tStore")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TStoreDO> tStoreList = tStoreService.list(query);
		int total = tStoreService.count(query);
		PageUtils pageUtils = new PageUtils(tStoreList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:tStore:add")
	String add(){
	    return "shop/tStore/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:tStore:edit")
	String edit(@PathVariable("id") Long id,Model model){
		TStoreDO tStore = tStoreService.get(id);
		model.addAttribute("tStore", tStore);
	    return "shop/tStore/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:tStore:add")
	public R save( TStoreDO tStore){
		if(tStoreService.save(tStore)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:tStore:edit")
	public R update( TStoreDO tStore){
		tStoreService.update(tStore);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:tStore:remove")
	public R remove( Long id){
		if(tStoreService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:tStore:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		tStoreService.batchRemove(ids);
		return R.ok();
	}
	
}
