package com.bootdo.small;

import com.bootdo.shop.domain.BannerDO;
import com.bootdo.shop.domain.CouponDO;
import com.bootdo.shop.domain.TArticleDO;
import com.bootdo.shop.domain.TGoodsTypeDO;
import com.bootdo.shop.domain.TStoreDO;
import com.bootdo.shop.domain.TopicDO;

import java.util.List;

/**
 * Created by Administrator on 2017/10/18 0018.
 */
public class IndexData {
    private List<TArticleDO> module_list ;
    private List<BannerDO> banner_list ;
    private List<TArticleDO> nav_icon_list ;
    private List<TGoodsTypeDO> cat_list ;
    private  int cat_goods_cols;
    private List<TArticleDO> block_list ;
    private List<CouponDO> coupon_list ;
    private List<TopicDO> topic_list ;
    private TStoreDO store;

    public void setModule_list(List<TArticleDO> module_list) {
        this.module_list = module_list;
    }

    public void setBanner_list(List<BannerDO> banner_list) {
        this.banner_list = banner_list;
    }

    public void setNav_icon_list(List<TArticleDO> nav_icon_list) {
        this.nav_icon_list = nav_icon_list;
    }

    public void setCat_list(List<TGoodsTypeDO> cat_list) {
        this.cat_list = cat_list;
    }

    public void setCat_goods_cols(int cat_goods_cols) {
        this.cat_goods_cols = cat_goods_cols;
    }

    public void setBlock_list(List<TArticleDO> block_list) {
        this.block_list = block_list;
    }

    public void setCoupon_list(List<CouponDO> coupon_list) {
        this.coupon_list = coupon_list;
    }

    public void setTopic_list(List<TopicDO> topic_list) {
        this.topic_list = topic_list;
    }

    public void setStore(TStoreDO store) {
        this.store = store;
    }

    public List<TArticleDO> getModule_list() {
        return module_list;
    }

    public List<BannerDO> getBanner_list() {
        return banner_list;
    }

    public List<TArticleDO> getNav_icon_list() {
        return nav_icon_list;
    }

    public List<TGoodsTypeDO> getCat_list() {
        return cat_list;
    }

    public int getCat_goods_cols() {
        return cat_goods_cols;
    }

    public List<TArticleDO> getBlock_list() {
        return block_list;
    }

    public List<CouponDO> getCoupon_list() {
        return coupon_list;
    }

    public List<TopicDO> getTopic_list() {
        return topic_list;
    }

    public TStoreDO getStore() {
        return store;
    }
}
