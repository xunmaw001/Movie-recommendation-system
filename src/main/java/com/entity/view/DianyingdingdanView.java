package com.entity.view;

import com.entity.DianyingdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电影订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
@TableName("dianyingdingdan")
public class DianyingdingdanView  extends DianyingdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianyingdingdanView(){
	}
 
 	public DianyingdingdanView(DianyingdingdanEntity dianyingdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, dianyingdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
