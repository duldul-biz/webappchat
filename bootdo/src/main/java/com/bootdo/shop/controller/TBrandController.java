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

import com.bootdo.shop.domain.TBrandDO;
import com.bootdo.shop.service.TBrandService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-15 15:07:36
 */
 
@Controller
@RequestMapping("/shop/tBrand")
public class TBrandController {
	@Autowired
	private TBrandService tBrandService;
	
	@GetMapping()
	@RequiresPermissions("shop:tBrand:tBrand")
	String TBrand(){
	    return "shop/tBrand/tBrand";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:tBrand:tBrand")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<TBrandDO> tBrandList = tBrandService.list(query);
		int total = tBrandService.count(query);
		PageUtils pageUtils = new PageUtils(tBrandList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:tBrand:add")
	String add(){
	    return "shop/tBrand/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:tBrand:edit")
	String edit(@PathVariable("id") Long id,Model model){
		TBrandDO tBrand = tBrandService.get(id);
		model.addAttribute("tBrand", tBrand);
	    return "shop/tBrand/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:tBrand:add")
	public R save( TBrandDO tBrand){
		if(tBrandService.save(tBrand)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:tBrand:edit")
	public R update( TBrandDO tBrand){
		tBrandService.update(tBrand);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:tBrand:remove")
	public R remove( Long id){
		if(tBrandService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:tBrand:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		tBrandService.batchRemove(ids);
		return R.ok();
	}
	
}
