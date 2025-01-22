package com.entity.vo;

import com.entity.DianyingdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 电影订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public class DianyingdingdanVO  implements Serializable {
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
	 * 购买时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date goumaishijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：购买时间
	 */
	 
	public void setGoumaishijian(Date goumaishijian) {
		this.goumaishijian = goumaishijian;
	}
	
	/**
	 * 获取：购买时间
	 */
	public Date getGoumaishijian() {
		return goumaishijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
