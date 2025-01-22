package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianfeidianyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianfeidianyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianfeidianyingView;


/**
 * 免费电影
 *
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface MianfeidianyingService extends IService<MianfeidianyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianfeidianyingVO> selectListVO(Wrapper<MianfeidianyingEntity> wrapper);
   	
   	MianfeidianyingVO selectVO(@Param("ew") Wrapper<MianfeidianyingEntity> wrapper);
   	
   	List<MianfeidianyingView> selectListView(Wrapper<MianfeidianyingEntity> wrapper);
   	
   	MianfeidianyingView selectView(@Param("ew") Wrapper<MianfeidianyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianfeidianyingEntity> wrapper);
   	

}

