package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.MianfeidianyingEntity;
import com.entity.view.MianfeidianyingView;

import com.service.MianfeidianyingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 免费电影
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
@RestController
@RequestMapping("/mianfeidianying")
public class MianfeidianyingController {
    @Autowired
    private MianfeidianyingService mianfeidianyingService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MianfeidianyingEntity mianfeidianying, 
		HttpServletRequest request){

        EntityWrapper<MianfeidianyingEntity> ew = new EntityWrapper<MianfeidianyingEntity>();
		PageUtils page = mianfeidianyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, mianfeidianying), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MianfeidianyingEntity mianfeidianying, 
		HttpServletRequest request){
        EntityWrapper<MianfeidianyingEntity> ew = new EntityWrapper<MianfeidianyingEntity>();
		PageUtils page = mianfeidianyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, mianfeidianying), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MianfeidianyingEntity mianfeidianying){
       	EntityWrapper<MianfeidianyingEntity> ew = new EntityWrapper<MianfeidianyingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( mianfeidianying, "mianfeidianying")); 
        return R.ok().put("data", mianfeidianyingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MianfeidianyingEntity mianfeidianying){
        EntityWrapper< MianfeidianyingEntity> ew = new EntityWrapper< MianfeidianyingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( mianfeidianying, "mianfeidianying")); 
		MianfeidianyingView mianfeidianyingView =  mianfeidianyingService.selectView(ew);
		return R.ok("查询免费电影成功").put("data", mianfeidianyingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MianfeidianyingEntity mianfeidianying = mianfeidianyingService.selectById(id);
		mianfeidianying.setClicknum(mianfeidianying.getClicknum()+1);
		mianfeidianying.setClicktime(new Date());
		mianfeidianyingService.updateById(mianfeidianying);
        return R.ok().put("data", mianfeidianying);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MianfeidianyingEntity mianfeidianying = mianfeidianyingService.selectById(id);
		mianfeidianying.setClicknum(mianfeidianying.getClicknum()+1);
		mianfeidianying.setClicktime(new Date());
		mianfeidianyingService.updateById(mianfeidianying);
        return R.ok().put("data", mianfeidianying);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        MianfeidianyingEntity mianfeidianying = mianfeidianyingService.selectById(id);
        if(type.equals("1")) {
        	mianfeidianying.setThumbsupnum(mianfeidianying.getThumbsupnum()+1);
        } else {
        	mianfeidianying.setCrazilynum(mianfeidianying.getCrazilynum()+1);
        }
        mianfeidianyingService.updateById(mianfeidianying);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MianfeidianyingEntity mianfeidianying, HttpServletRequest request){
    	mianfeidianying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(mianfeidianying);

        mianfeidianyingService.insert(mianfeidianying);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MianfeidianyingEntity mianfeidianying, HttpServletRequest request){
    	mianfeidianying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(mianfeidianying);

        mianfeidianyingService.insert(mianfeidianying);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MianfeidianyingEntity mianfeidianying, HttpServletRequest request){
        //ValidatorUtils.validateEntity(mianfeidianying);
        mianfeidianyingService.updateById(mianfeidianying);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        mianfeidianyingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<MianfeidianyingEntity> wrapper = new EntityWrapper<MianfeidianyingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = mianfeidianyingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,MianfeidianyingEntity mianfeidianying, HttpServletRequest request,String pre){
        EntityWrapper<MianfeidianyingEntity> ew = new EntityWrapper<MianfeidianyingEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = mianfeidianyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, mianfeidianying), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,MianfeidianyingEntity mianfeidianying, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "dianyingfenlei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "mianfeidianying").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<MianfeidianyingEntity> mianfeidianyingList = new ArrayList<MianfeidianyingEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                mianfeidianyingList.addAll(mianfeidianyingService.selectList(new EntityWrapper<MianfeidianyingEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<MianfeidianyingEntity> ew = new EntityWrapper<MianfeidianyingEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = mianfeidianyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, mianfeidianying), params), params));
        List<MianfeidianyingEntity> pageList = (List<MianfeidianyingEntity>)page.getList();
        if(mianfeidianyingList.size()<limit) {
            int toAddNum = (limit-mianfeidianyingList.size())<=pageList.size()?(limit-mianfeidianyingList.size()):pageList.size();
            for(MianfeidianyingEntity o1 : pageList) {
                boolean addFlag = true;
                for(MianfeidianyingEntity o2 : mianfeidianyingList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    mianfeidianyingList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        }
        page.setList(mianfeidianyingList);
        return R.ok().put("data", page);
    }





}
