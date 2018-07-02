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

import com.bootdo.shop.domain.TGoodsClassDO;
import com.bootdo.shop.service.TGoodsClassService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 商品分类表
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-15 15:07:36
 */
 
@Controller
@RequestMapping("/shop/tGoodsClass")
public class TGoodsClassController {
	@Autowired
	private TGoodsClassService tGoodsClassService;
	
	@GetMapping()
	@RequiresPermissions("shop:tGoodsClass:tGoodsClass")
	String TGoodsClass(){
	    return "shop/tGoodsClass/tGoodsClass";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:tGoodsClass:tGoodsClass")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TGoodsClassDO> tGoodsClassList = tGoodsClassService.list(query);
		int total = tGoodsClassService.count(query);
		PageUtils pageUtils = new PageUtils(tGoodsClassList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:tGoodsClass:add")
	String add(){
	    return "shop/tGoodsClass/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:tGoodsClass:edit")
	String edit(@PathVariable("id") Long id,Model model){
		TGoodsClassDO tGoodsClass = tGoodsClassService.get(id);
		model.addAttribute("tGoodsClass", tGoodsClass);
	    return "shop/tGoodsClass/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:tGoodsClass:add")
	public R save( TGoodsClassDO tGoodsClass){
		if(tGoodsClassService.save(tGoodsClass)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:tGoodsClass:edit")
	public R update( TGoodsClassDO tGoodsClass){
		tGoodsClassService.update(tGoodsClass);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:tGoodsClass:remove")
	public R remove( Long id){
		if(tGoodsClassService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:tGoodsClass:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		tGoodsClassService.batchRemove(ids);
		return R.ok();
	}
	
}
