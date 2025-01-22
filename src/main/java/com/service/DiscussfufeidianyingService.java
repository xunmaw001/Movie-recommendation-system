package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfufeidianyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfufeidianyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfufeidianyingView;


/**
 * 付费电影评论表
 *
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface DiscussfufeidianyingService extends IService<DiscussfufeidianyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfufeidianyingVO> selectListVO(Wrapper<DiscussfufeidianyingEntity> wrapper);
   	
   	DiscussfufeidianyingVO selectVO(@Param("ew") Wrapper<DiscussfufeidianyingEntity> wrapper);
   	
   	List<DiscussfufeidianyingView> selectListView(Wrapper<DiscussfufeidianyingEntity> wrapper);
   	
   	DiscussfufeidianyingView selectView(@Param("ew") Wrapper<DiscussfufeidianyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfufeidianyingEntity> wrapper);
   	

}

