package com.entity.view;

import com.entity.DiscussmianfeidianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 免费电影评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
@TableName("discussmianfeidianying")
public class DiscussmianfeidianyingView  extends DiscussmianfeidianyingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmianfeidianyingView(){
	}
 
 	public DiscussmianfeidianyingView(DiscussmianfeidianyingEntity discussmianfeidianyingEntity){
 	try {
			BeanUtils.copyProperties(this, discussmianfeidianyingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
