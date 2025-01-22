package com.dao;

import com.entity.WodedianyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodedianyingVO;
import com.entity.view.WodedianyingView;


/**
 * 我的电影
 * 
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface WodedianyingDao extends BaseMapper<WodedianyingEntity> {
	
	List<WodedianyingVO> selectListVO(@Param("ew") Wrapper<WodedianyingEntity> wrapper);
	
	WodedianyingVO selectVO(@Param("ew") Wrapper<WodedianyingEntity> wrapper);
	
	List<WodedianyingView> selectListView(@Param("ew") Wrapper<WodedianyingEntity> wrapper);

	List<WodedianyingView> selectListView(Pagination page,@Param("ew") Wrapper<WodedianyingEntity> wrapper);
	
	WodedianyingView selectView(@Param("ew") Wrapper<WodedianyingEntity> wrapper);
	

}
