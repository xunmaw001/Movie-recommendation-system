package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmianfeidianyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmianfeidianyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmianfeidianyingView;


/**
 * 免费电影评论表
 *
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface DiscussmianfeidianyingService extends IService<DiscussmianfeidianyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmianfeidianyingVO> selectListVO(Wrapper<DiscussmianfeidianyingEntity> wrapper);
   	
   	DiscussmianfeidianyingVO selectVO(@Param("ew") Wrapper<DiscussmianfeidianyingEntity> wrapper);
   	
   	List<DiscussmianfeidianyingView> selectListView(Wrapper<DiscussmianfeidianyingEntity> wrapper);
   	
   	DiscussmianfeidianyingView selectView(@Param("ew") Wrapper<DiscussmianfeidianyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmianfeidianyingEntity> wrapper);
   	

}

