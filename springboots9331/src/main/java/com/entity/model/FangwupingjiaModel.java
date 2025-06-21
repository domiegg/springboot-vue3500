package com.entity.model;

import com.entity.FangwupingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房屋评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-10 15:56:44
 */
public class FangwupingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋类型
	 */
	
	private String fangwuleixing;
		
	/**
	 * 房屋面积
	 */
	
	private String fangwumianji;
		
	/**
	 * 房屋图片
	 */
	
	private String fangwutupian;
		
	/**
	 * 房屋评分
	 */
	
	private String fangwupingfen;
		
	/**
	 * 房屋评价
	 */
	
	private String fangwupingjia;
		
	/**
	 * 房主账号
	 */
	
	private String fangzhuzhanghao;
		
	/**
	 * 评价日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiariqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
				
	
	/**
	 * 设置：房屋类型
	 */
	 
	public void setFangwuleixing(String fangwuleixing) {
		this.fangwuleixing = fangwuleixing;
	}
	
	/**
	 * 获取：房屋类型
	 */
	public String getFangwuleixing() {
		return fangwuleixing;
	}
				
	
	/**
	 * 设置：房屋面积
	 */
	 
	public void setFangwumianji(String fangwumianji) {
		this.fangwumianji = fangwumianji;
	}
	
	/**
	 * 获取：房屋面积
	 */
	public String getFangwumianji() {
		return fangwumianji;
	}
				
	
	/**
	 * 设置：房屋图片
	 */
	 
	public void setFangwutupian(String fangwutupian) {
		this.fangwutupian = fangwutupian;
	}
	
	/**
	 * 获取：房屋图片
	 */
	public String getFangwutupian() {
		return fangwutupian;
	}
				
	
	/**
	 * 设置：房屋评分
	 */
	 
	public void setFangwupingfen(String fangwupingfen) {
		this.fangwupingfen = fangwupingfen;
	}
	
	/**
	 * 获取：房屋评分
	 */
	public String getFangwupingfen() {
		return fangwupingfen;
	}
				
	
	/**
	 * 设置：房屋评价
	 */
	 
	public void setFangwupingjia(String fangwupingjia) {
		this.fangwupingjia = fangwupingjia;
	}
	
	/**
	 * 获取：房屋评价
	 */
	public String getFangwupingjia() {
		return fangwupingjia;
	}
				
	
	/**
	 * 设置：房主账号
	 */
	 
	public void setFangzhuzhanghao(String fangzhuzhanghao) {
		this.fangzhuzhanghao = fangzhuzhanghao;
	}
	
	/**
	 * 获取：房主账号
	 */
	public String getFangzhuzhanghao() {
		return fangzhuzhanghao;
	}
				
	
	/**
	 * 设置：评价日期
	 */
	 
	public void setPingjiariqi(Date pingjiariqi) {
		this.pingjiariqi = pingjiariqi;
	}
	
	/**
	 * 获取：评价日期
	 */
	public Date getPingjiariqi() {
		return pingjiariqi;
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
			
}
