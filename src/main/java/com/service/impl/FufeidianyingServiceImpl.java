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


import com.dao.FufeidianyingDao;
import com.entity.FufeidianyingEntity;
import com.service.FufeidianyingService;
import com.entity.vo.FufeidianyingVO;
import com.entity.view.FufeidianyingView;

@Service("fufeidianyingService")
public class FufeidianyingServiceImpl extends ServiceImpl<FufeidianyingDao, FufeidianyingEntity> implements FufeidianyingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FufeidianyingEntity> page = this.selectPage(
                new Query<FufeidianyingEntity>(params).getPage(),
                new EntityWrapper<FufeidianyingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FufeidianyingEntity> wrapper) {
		  Page<FufeidianyingView> page =new Query<FufeidianyingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FufeidianyingVO> selectListVO(Wrapper<FufeidianyingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FufeidianyingVO selectVO(Wrapper<FufeidianyingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FufeidianyingView> selectListView(Wrapper<FufeidianyingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FufeidianyingView selectView(Wrapper<FufeidianyingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
