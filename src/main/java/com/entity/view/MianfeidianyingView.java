package com.entity.view;

import com.entity.MianfeidianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 免费电影
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
@TableName("mianfeidianying")
public class MianfeidianyingView  extends MianfeidianyingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MianfeidianyingView(){
	}
 
 	public MianfeidianyingView(MianfeidianyingEntity mianfeidianyingEntity){
 	try {
			BeanUtils.copyProperties(this, mianfeidianyingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
