package com.bootdo.app;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.shop.domain.TArticleDO;
import com.bootdo.shop.domain.TBrandDO;
import com.bootdo.shop.domain.TGoodsDO;
import com.bootdo.shop.domain.TGoodsTypeDO;
import com.bootdo.shop.service.TArticleService;
import com.bootdo.shop.service.TBrandService;
import com.bootdo.shop.service.TGoodsClassService;
import com.bootdo.shop.service.TGoodsService;
import com.bootdo.shop.service.TGoodsTypeService;
import com.bootdo.wap.MemberUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zscat
 * @email 951449465@qq.com
 * @date 2017-10-15 15:07:36
 */

@Controller
@RequestMapping("/app")
public class AppIndexController {
    @Autowired
    private TArticleService tArticleService;
    @Autowired
    private TBrandService tBrandService;
    @Autowired
    private TGoodsTypeService tGoodsTypeService;
    @Autowired
    private TGoodsService tGoodsService;
    @Autowired
    private TGoodsClassService tGoodsClassService;

    @RequestMapping("")
    public R index(HttpServletRequest req) {
        R r = new R();
        try {
            Map<String, Object> model = new HashMap<>();

            Map<String, Object> params = new HashMap<>();
            params.put("sort", "clickHit");
            params.put("order", "desc");
            model.put("hitList", tGoodsService.list(params));
            params.clear();
            params.put("sort", "create_date");
            params.put("order", "desc");
            model.put("xinpinList", tGoodsService.list(params));
            params.clear();
            params.put("iscom", "1");
            model.put("commList", tGoodsService.list(params));
            if (MemberUtils.getSessionLoginUser() != null) {
                model.put("city", MemberUtils.getSessionLoginUser().getUsername());
            } else {
                model.put("city", "未登录");
            }
            r.put("data", model);
            return r;
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
    }

    @RequestMapping("/goodsDetail/{id}")
    public R goodsDetail(@PathVariable("id") Long id, HttpServletRequest req) throws Exception {
        R r = new R();
        Map<String, Object> model = new HashMap<>();
        try {
            TGoodsDO goods = tGoodsService.get(id);
            model.put("goods", goods);
            if (goods.getImgmore() != null && goods.getImgmore().indexOf(",") > -1) {
                model.put("imgs", goods.getImgmore().split(","));
            }
            goods.setClickhit(goods.getClickhit() + 1);
            tGoodsService.update(goods);
            //查询详情商品的 其他商品

            Map<String, Object> params = new HashMap<>();
            params.put("createBy", goods.getCreateBy());

            model.put("ownGoods", tGoodsService.list(params));
            r.put("data", model);
            return r;
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
    }

    @ResponseBody
    @GetMapping("/banner/list")
    public R banner(@RequestParam Map<String, Object> params) {
        //查询列表数据
        R r = new R();
        try {
            Query query = new Query(params);
            List<TBrandDO> tArticleList = tBrandService.list(query);
            int total = tBrandService.count(query);
            PageUtils pageUtils = new PageUtils(tArticleList, total);

            r.put("data", pageUtils);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
        return r;
    }

    @ResponseBody
    @GetMapping("/category/all")
    public R category(@RequestParam Map<String, Object> params) {
        //查询列表数据
        R r = new R();
        try {
            Query query = new Query(params);
            List<TGoodsTypeDO> tArticleList = tGoodsTypeService.list(query);
            int total = tGoodsTypeService.count(query);
            PageUtils pageUtils = new PageUtils(tArticleList, total);

            r.put("data", pageUtils);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
        return r;
    }

    @ResponseBody
    @GetMapping("/goods/list")
    public R goods(@RequestParam Map<String, Object> params) {
        R r = new R();
        try {
            Query query = new Query(params);
            List<TGoodsDO> tArticleList = tGoodsService.list(query);
            int total = tGoodsService.count(query);
            PageUtils pageUtils = new PageUtils(tArticleList, total);
            r.put("data", pageUtils);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
        return r;
    }

    @ResponseBody
    @GetMapping("/article/list")
    public R article(@RequestParam Map<String, Object> params) {
        R r = new R();
        try {
            Query query = new Query(params);
            List<TArticleDO> tArticleList = tArticleService.list(query);
            int total = tArticleService.count(query);
            PageUtils pageUtils = new PageUtils(tArticleList, total);
            r.put("data", pageUtils);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }
        return r;
    }

    @PostMapping("/user/check-token")
    @ResponseBody
    public R remove(String token) {
//		if(tArticleService.remove(id)>0){
//			return R.ok();
//		}
        return R.error();
    }

}
