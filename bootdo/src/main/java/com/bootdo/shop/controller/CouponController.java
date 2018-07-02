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

import com.bootdo.shop.domain.CouponDO;
import com.bootdo.shop.service.CouponService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-18 13:12:04
 */
 
@Controller
@RequestMapping("/shop/coupon")
public class CouponController {
	@Autowired
	private CouponService couponService;
	
	@GetMapping()
	@RequiresPermissions("shop:coupon:coupon")
	String Coupon(){
	    return "shop/coupon/coupon";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("shop:coupon:coupon")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CouponDO> couponList = couponService.list(query);
		int total = couponService.count(query);
		PageUtils pageUtils = new PageUtils(couponList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("shop:coupon:add")
	String add(){
	    return "shop/coupon/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("shop:coupon:edit")
	String edit(@PathVariable("id") Long id,Model model){
		CouponDO coupon = couponService.get(id);
		model.addAttribute("coupon", coupon);
	    return "shop/coupon/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("shop:coupon:add")
	public R save( CouponDO coupon){
		if(couponService.save(coupon)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("shop:coupon:edit")
	public R update( CouponDO coupon){
		couponService.update(coupon);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("shop:coupon:remove")
	public R remove( Long id){
		if(couponService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("shop:coupon:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		couponService.batchRemove(ids);
		return R.ok();
	}
	
}
