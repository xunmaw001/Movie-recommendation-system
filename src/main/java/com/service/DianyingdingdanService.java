package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianyingdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianyingdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianyingdingdanView;


/**
 * 电影订单
 *
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public interface DianyingdingdanService extends IService<DianyingdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianyingdingdanVO> selectListVO(Wrapper<DianyingdingdanEntity> wrapper);
   	
   	DianyingdingdanVO selectVO(@Param("ew") Wrapper<DianyingdingdanEntity> wrapper);
   	
   	List<DianyingdingdanView> selectListView(Wrapper<DianyingdingdanEntity> wrapper);
   	
   	DianyingdingdanView selectView(@Param("ew") Wrapper<DianyingdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianyingdingdanEntity> wrapper);
   	

}

