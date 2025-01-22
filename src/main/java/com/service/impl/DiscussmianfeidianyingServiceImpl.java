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


import com.dao.DiscussmianfeidianyingDao;
import com.entity.DiscussmianfeidianyingEntity;
import com.service.DiscussmianfeidianyingService;
import com.entity.vo.DiscussmianfeidianyingVO;
import com.entity.view.DiscussmianfeidianyingView;

@Service("discussmianfeidianyingService")
public class DiscussmianfeidianyingServiceImpl extends ServiceImpl<DiscussmianfeidianyingDao, DiscussmianfeidianyingEntity> implements DiscussmianfeidianyingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmianfeidianyingEntity> page = this.selectPage(
                new Query<DiscussmianfeidianyingEntity>(params).getPage(),
                new EntityWrapper<DiscussmianfeidianyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmianfeidianyingEntity> wrapper) {
		  Page<DiscussmianfeidianyingView> page =new Query<DiscussmianfeidianyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmianfeidianyingVO> selectListVO(Wrapper<DiscussmianfeidianyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmianfeidianyingVO selectVO(Wrapper<DiscussmianfeidianyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmianfeidianyingView> selectListView(Wrapper<DiscussmianfeidianyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmianfeidianyingView selectView(Wrapper<DiscussmianfeidianyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
