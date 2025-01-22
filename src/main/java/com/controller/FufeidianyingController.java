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

import com.entity.FufeidianyingEntity;
import com.entity.view.FufeidianyingView;

import com.service.FufeidianyingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 付费电影
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
@RestController
@RequestMapping("/fufeidianying")
public class FufeidianyingController {
    @Autowired
    private FufeidianyingService fufeidianyingService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FufeidianyingEntity fufeidianying, 
		HttpServletRequest request){

        EntityWrapper<FufeidianyingEntity> ew = new EntityWrapper<FufeidianyingEntity>();
		PageUtils page = fufeidianyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fufeidianying), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FufeidianyingEntity fufeidianying, 
		HttpServletRequest request){
        EntityWrapper<FufeidianyingEntity> ew = new EntityWrapper<FufeidianyingEntity>();
		PageUtils page = fufeidianyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fufeidianying), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FufeidianyingEntity fufeidianying){
       	EntityWrapper<FufeidianyingEntity> ew = new EntityWrapper<FufeidianyingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fufeidianying, "fufeidianying")); 
        return R.ok().put("data", fufeidianyingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FufeidianyingEntity fufeidianying){
        EntityWrapper< FufeidianyingEntity> ew = new EntityWrapper< FufeidianyingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fufeidianying, "fufeidianying")); 
		FufeidianyingView fufeidianyingView =  fufeidianyingService.selectView(ew);
		return R.ok("查询付费电影成功").put("data", fufeidianyingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FufeidianyingEntity fufeidianying = fufeidianyingService.selectById(id);
		fufeidianying.setClicknum(fufeidianying.getClicknum()+1);
		fufeidianying.setClicktime(new Date());
		fufeidianyingService.updateById(fufeidianying);
        return R.ok().put("data", fufeidianying);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FufeidianyingEntity fufeidianying = fufeidianyingService.selectById(id);
		fufeidianying.setClicknum(fufeidianying.getClicknum()+1);
		fufeidianying.setClicktime(new Date());
		fufeidianyingService.updateById(fufeidianying);
        return R.ok().put("data", fufeidianying);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        FufeidianyingEntity fufeidianying = fufeidianyingService.selectById(id);
        if(type.equals("1")) {
        	fufeidianying.setThumbsupnum(fufeidianying.getThumbsupnum()+1);
        } else {
        	fufeidianying.setCrazilynum(fufeidianying.getCrazilynum()+1);
        }
        fufeidianyingService.updateById(fufeidianying);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FufeidianyingEntity fufeidianying, HttpServletRequest request){
    	fufeidianying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fufeidianying);

        fufeidianyingService.insert(fufeidianying);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FufeidianyingEntity fufeidianying, HttpServletRequest request){
    	fufeidianying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fufeidianying);

        fufeidianyingService.insert(fufeidianying);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody FufeidianyingEntity fufeidianying, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fufeidianying);
        fufeidianyingService.updateById(fufeidianying);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fufeidianyingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<FufeidianyingEntity> wrapper = new EntityWrapper<FufeidianyingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = fufeidianyingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,FufeidianyingEntity fufeidianying, HttpServletRequest request,String pre){
        EntityWrapper<FufeidianyingEntity> ew = new EntityWrapper<FufeidianyingEntity>();
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
		PageUtils page = fufeidianyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fufeidianying), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,FufeidianyingEntity fufeidianying, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "dianyingfenlei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "fufeidianying").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<FufeidianyingEntity> fufeidianyingList = new ArrayList<FufeidianyingEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                fufeidianyingList.addAll(fufeidianyingService.selectList(new EntityWrapper<FufeidianyingEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<FufeidianyingEntity> ew = new EntityWrapper<FufeidianyingEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = fufeidianyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fufeidianying), params), params));
        List<FufeidianyingEntity> pageList = (List<FufeidianyingEntity>)page.getList();
        if(fufeidianyingList.size()<limit) {
            int toAddNum = (limit-fufeidianyingList.size())<=pageList.size()?(limit-fufeidianyingList.size()):pageList.size();
            for(FufeidianyingEntity o1 : pageList) {
                boolean addFlag = true;
                for(FufeidianyingEntity o2 : fufeidianyingList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    fufeidianyingList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        }
        page.setList(fufeidianyingList);
        return R.ok().put("data", page);
    }





}
