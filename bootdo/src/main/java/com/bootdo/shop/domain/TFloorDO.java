package com.bootdo.shop.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品类型表
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-15 15:07:36
 */
public class TFloorDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//类型id
	private Long id;
	//类型名称
	private String name;
	//商品类型排序
	private Integer typesort;
	//父id
	private Long parentId;
	//
	private String parentIds;
	//标题
	private String title;
	//
	private String delFlag;
	//活动图片
	private String advimg;
	//活动链接
	private String advurl;

	/**
	 * 设置：类型id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：类型id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：类型名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：类型名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：商品类型排序
	 */
	public void setTypesort(Integer typesort) {
		this.typesort = typesort;
	}
	/**
	 * 获取：商品类型排序
	 */
	public Integer getTypesort() {
		return typesort;
	}
	/**
	 * 设置：父id
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父id
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * 设置：
	 */
	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}
	/**
	 * 获取：
	 */
	public String getParentIds() {
		return parentIds;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：
	 */
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 获取：
	 */
	public String getDelFlag() {
		return delFlag;
	}
	/**
	 * 设置：活动图片
	 */
	public void setAdvimg(String advimg) {
		this.advimg = advimg;
	}
	/**
	 * 获取：活动图片
	 */
	public String getAdvimg() {
		return advimg;
	}
	/**
	 * 设置：活动链接
	 */
	public void setAdvurl(String advurl) {
		this.advurl = advurl;
	}
	/**
	 * 获取：活动链接
	 */
	public String getAdvurl() {
		return advurl;
	}
}
