package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodedianyingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodedianyingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodedianyingView;


/**
 * 我的电影
 *
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface WodedianyingService extends IService<WodedianyingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodedianyingVO> selectListVO(Wrapper<WodedianyingEntity> wrapper);
   	
   	WodedianyingVO selectVO(@Param("ew") Wrapper<WodedianyingEntity> wrapper);
   	
   	List<WodedianyingView> selectListView(Wrapper<WodedianyingEntity> wrapper);
   	
   	WodedianyingView selectView(@Param("ew") Wrapper<WodedianyingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodedianyingEntity> wrapper);
   	

}

