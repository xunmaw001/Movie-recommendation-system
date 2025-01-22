package com.dao;

import com.entity.DianyingdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianyingdingdanVO;
import com.entity.view.DianyingdingdanView;


/**
 * 电影订单
 * 
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface DianyingdingdanDao extends BaseMapper<DianyingdingdanEntity> {
	
	List<DianyingdingdanVO> selectListVO(@Param("ew") Wrapper<DianyingdingdanEntity> wrapper);
	
	DianyingdingdanVO selectVO(@Param("ew") Wrapper<DianyingdingdanEntity> wrapper);
	
	List<DianyingdingdanView> selectListView(@Param("ew") Wrapper<DianyingdingdanEntity> wrapper);

	List<DianyingdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<DianyingdingdanEntity> wrapper);
	
	DianyingdingdanView selectView(@Param("ew") Wrapper<DianyingdingdanEntity> wrapper);
	

}
