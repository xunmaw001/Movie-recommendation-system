package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MianfeidianyingDao;
import com.entity.MianfeidianyingEntity;
import com.service.MianfeidianyingService;
import com.entity.vo.MianfeidianyingVO;
import com.entity.view.MianfeidianyingView;

@Service("mianfeidianyingService")
public class MianfeidianyingServiceImpl extends ServiceImpl<MianfeidianyingDao, MianfeidianyingEntity> implements MianfeidianyingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MianfeidianyingEntity> page = this.selectPage(
                new Query<MianfeidianyingEntity>(params).getPage(),
                new EntityWrapper<MianfeidianyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MianfeidianyingEntity> wrapper) {
		  Page<MianfeidianyingView> page =new Query<MianfeidianyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MianfeidianyingVO> selectListVO(Wrapper<MianfeidianyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MianfeidianyingVO selectVO(Wrapper<MianfeidianyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MianfeidianyingView> selectListView(Wrapper<MianfeidianyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MianfeidianyingView selectView(Wrapper<MianfeidianyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
