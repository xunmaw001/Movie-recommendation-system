package com.dao;

import com.entity.DiscussfufeidianyingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfufeidianyingVO;
import com.entity.view.DiscussfufeidianyingView;


/**
 * 付费电影评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface DiscussfufeidianyingDao extends BaseMapper<DiscussfufeidianyingEntity> {
	
	List<DiscussfufeidianyingVO> selectListVO(@Param("ew") Wrapper<DiscussfufeidianyingEntity> wrapper);
	
	DiscussfufeidianyingVO selectVO(@Param("ew") Wrapper<DiscussfufeidianyingEntity> wrapper);
	
	List<DiscussfufeidianyingView> selectListView(@Param("ew") Wrapper<DiscussfufeidianyingEntity> wrapper);

	List<DiscussfufeidianyingView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfufeidianyingEntity> wrapper);
	
	DiscussfufeidianyingView selectView(@Param("ew") Wrapper<DiscussfufeidianyingEntity> wrapper);
	

}
