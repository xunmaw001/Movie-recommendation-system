package com.dao;

import com.entity.MianfeidianyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianfeidianyingVO;
import com.entity.view.MianfeidianyingView;


/**
 * 免费电影
 * 
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface MianfeidianyingDao extends BaseMapper<MianfeidianyingEntity> {
	
	List<MianfeidianyingVO> selectListVO(@Param("ew") Wrapper<MianfeidianyingEntity> wrapper);
	
	MianfeidianyingVO selectVO(@Param("ew") Wrapper<MianfeidianyingEntity> wrapper);
	
	List<MianfeidianyingView> selectListView(@Param("ew") Wrapper<MianfeidianyingEntity> wrapper);

	List<MianfeidianyingView> selectListView(Pagination page,@Param("ew") Wrapper<MianfeidianyingEntity> wrapper);
	
	MianfeidianyingView selectView(@Param("ew") Wrapper<MianfeidianyingEntity> wrapper);
	

}
