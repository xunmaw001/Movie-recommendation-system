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


import com.dao.DianyingdingdanDao;
import com.entity.DianyingdingdanEntity;
import com.service.DianyingdingdanService;
import com.entity.vo.DianyingdingdanVO;
import com.entity.view.DianyingdingdanView;

@Service("dianyingdingdanService")
public class DianyingdingdanServiceImpl extends ServiceImpl<DianyingdingdanDao, DianyingdingdanEntity> implements DianyingdingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianyingdingdanEntity> page = this.selectPage(
                new Query<DianyingdingdanEntity>(params).getPage(),
                new EntityWrapper<DianyingdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianyingdingdanEntity> wrapper) {
		  Page<DianyingdingdanView> page =new Query<DianyingdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianyingdingdanVO> selectListVO(Wrapper<DianyingdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianyingdingdanVO selectVO(Wrapper<DianyingdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianyingdingdanView> selectListView(Wrapper<DianyingdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianyingdingdanView selectView(Wrapper<DianyingdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
