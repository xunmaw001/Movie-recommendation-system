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


import com.dao.WodedianyingDao;
import com.entity.WodedianyingEntity;
import com.service.WodedianyingService;
import com.entity.vo.WodedianyingVO;
import com.entity.view.WodedianyingView;

@Service("wodedianyingService")
public class WodedianyingServiceImpl extends ServiceImpl<WodedianyingDao, WodedianyingEntity> implements WodedianyingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodedianyingEntity> page = this.selectPage(
                new Query<WodedianyingEntity>(params).getPage(),
                new EntityWrapper<WodedianyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodedianyingEntity> wrapper) {
		  Page<WodedianyingView> page =new Query<WodedianyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodedianyingVO> selectListVO(Wrapper<WodedianyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodedianyingVO selectVO(Wrapper<WodedianyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodedianyingView> selectListView(Wrapper<WodedianyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodedianyingView selectView(Wrapper<WodedianyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
