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


import com.dao.DiscussfufeidianyingDao;
import com.entity.DiscussfufeidianyingEntity;
import com.service.DiscussfufeidianyingService;
import com.entity.vo.DiscussfufeidianyingVO;
import com.entity.view.DiscussfufeidianyingView;

@Service("discussfufeidianyingService")
public class DiscussfufeidianyingServiceImpl extends ServiceImpl<DiscussfufeidianyingDao, DiscussfufeidianyingEntity> implements DiscussfufeidianyingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfufeidianyingEntity> page = this.selectPage(
                new Query<DiscussfufeidianyingEntity>(params).getPage(),
                new EntityWrapper<DiscussfufeidianyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfufeidianyingEntity> wrapper) {
		  Page<DiscussfufeidianyingView> page =new Query<DiscussfufeidianyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfufeidianyingVO> selectListVO(Wrapper<DiscussfufeidianyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfufeidianyingVO selectVO(Wrapper<DiscussfufeidianyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfufeidianyingView> selectListView(Wrapper<DiscussfufeidianyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfufeidianyingView selectView(Wrapper<DiscussfufeidianyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
