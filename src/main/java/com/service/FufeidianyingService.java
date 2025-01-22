package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FufeidianyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FufeidianyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FufeidianyingView;


/**
 * 付费电影
 *
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface FufeidianyingService extends IService<FufeidianyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FufeidianyingVO> selectListVO(Wrapper<FufeidianyingEntity> wrapper);
   	
   	FufeidianyingVO selectVO(@Param("ew") Wrapper<FufeidianyingEntity> wrapper);
   	
   	List<FufeidianyingView> selectListView(Wrapper<FufeidianyingEntity> wrapper);
   	
   	FufeidianyingView selectView(@Param("ew") Wrapper<FufeidianyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FufeidianyingEntity> wrapper);
   	

}

