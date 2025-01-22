package com.dao;

import com.entity.DiscussmianfeidianyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmianfeidianyingVO;
import com.entity.view.DiscussmianfeidianyingView;


/**
 * 免费电影评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface DiscussmianfeidianyingDao extends BaseMapper<DiscussmianfeidianyingEntity> {
	
	List<DiscussmianfeidianyingVO> selectListVO(@Param("ew") Wrapper<DiscussmianfeidianyingEntity> wrapper);
	
	DiscussmianfeidianyingVO selectVO(@Param("ew") Wrapper<DiscussmianfeidianyingEntity> wrapper);
	
	List<DiscussmianfeidianyingView> selectListView(@Param("ew") Wrapper<DiscussmianfeidianyingEntity> wrapper);

	List<DiscussmianfeidianyingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmianfeidianyingEntity> wrapper);
	
	DiscussmianfeidianyingView selectView(@Param("ew") Wrapper<DiscussmianfeidianyingEntity> wrapper);
	

}
