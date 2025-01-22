package com.entity.vo;

import com.entity.WodedianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 我的电影
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public class WodedianyingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影编号
	 */
	
	private String dianyingbianhao;
		
	/**
	 * 电影名称
	 */
	
	private String dianyingmingcheng;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 电影链接
	 */
	
	private String dianyinglianjie;
				
	
	/**
	 * 设置：电影编号
	 */
	 
	public void setDianyingbianhao(String dianyingbianhao) {
		this.dianyingbianhao = dianyingbianhao;
	}
	
	/**
	 * 获取：电影编号
	 */
	public String getDianyingbianhao() {
		return dianyingbianhao;
	}
				
	
	/**
	 * 设置：电影名称
	 */
	 
	public void setDianyingmingcheng(String dianyingmingcheng) {
		this.dianyingmingcheng = dianyingmingcheng;
	}
	
	/**
	 * 获取：电影名称
	 */
	public String getDianyingmingcheng() {
		return dianyingmingcheng;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：电影链接
	 */
	 
	public void setDianyinglianjie(String dianyinglianjie) {
		this.dianyinglianjie = dianyinglianjie;
	}
	
	/**
	 * 获取：电影链接
	 */
	public String getDianyinglianjie() {
		return dianyinglianjie;
	}
			
}
