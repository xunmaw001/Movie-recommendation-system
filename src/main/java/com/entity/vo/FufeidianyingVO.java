package com.entity.vo;

import com.entity.FufeidianyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 付费电影
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-06 21:42:07
 */
public class FufeidianyingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电影名称
	 */
	
	private String dianyingmingcheng;
		
	/**
	 * 电影分类
	 */
	
	private String dianyingfenlei;
		
	/**
	 * 预告片
	 */
	
	private String yugaopian;
		
	/**
	 * 海报
	 */
	
	private String haibao;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 评分
	 */
	
	private Float pingfen;
		
	/**
	 * 开映时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaiyingshijian;
		
	/**
	 * 时长
	 */
	
	private String shizhang;
		
	/**
	 * 主演
	 */
	
	private String zhuyan;
		
	/**
	 * 导演
	 */
	
	private String daoyan;
		
	/**
	 * 电影详情
	 */
	
	private String dianyingxiangqing;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：电影分类
	 */
	 
	public void setDianyingfenlei(String dianyingfenlei) {
		this.dianyingfenlei = dianyingfenlei;
	}
	
	/**
	 * 获取：电影分类
	 */
	public String getDianyingfenlei() {
		return dianyingfenlei;
	}
				
	
	/**
	 * 设置：预告片
	 */
	 
	public void setYugaopian(String yugaopian) {
		this.yugaopian = yugaopian;
	}
	
	/**
	 * 获取：预告片
	 */
	public String getYugaopian() {
		return yugaopian;
	}
				
	
	/**
	 * 设置：海报
	 */
	 
	public void setHaibao(String haibao) {
		this.haibao = haibao;
	}
	
	/**
	 * 获取：海报
	 */
	public String getHaibao() {
		return haibao;
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
	 * 设置：评分
	 */
	 
	public void setPingfen(Float pingfen) {
		this.pingfen = pingfen;
	}
	
	/**
	 * 获取：评分
	 */
	public Float getPingfen() {
		return pingfen;
	}
				
	
	/**
	 * 设置：开映时间
	 */
	 
	public void setKaiyingshijian(Date kaiyingshijian) {
		this.kaiyingshijian = kaiyingshijian;
	}
	
	/**
	 * 获取：开映时间
	 */
	public Date getKaiyingshijian() {
		return kaiyingshijian;
	}
				
	
	/**
	 * 设置：时长
	 */
	 
	public void setShizhang(String shizhang) {
		this.shizhang = shizhang;
	}
	
	/**
	 * 获取：时长
	 */
	public String getShizhang() {
		return shizhang;
	}
				
	
	/**
	 * 设置：主演
	 */
	 
	public void setZhuyan(String zhuyan) {
		this.zhuyan = zhuyan;
	}
	
	/**
	 * 获取：主演
	 */
	public String getZhuyan() {
		return zhuyan;
	}
				
	
	/**
	 * 设置：导演
	 */
	 
	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}
	
	/**
	 * 获取：导演
	 */
	public String getDaoyan() {
		return daoyan;
	}
				
	
	/**
	 * 设置：电影详情
	 */
	 
	public void setDianyingxiangqing(String dianyingxiangqing) {
		this.dianyingxiangqing = dianyingxiangqing;
	}
	
	/**
	 * 获取：电影详情
	 */
	public String getDianyingxiangqing() {
		return dianyingxiangqing;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
