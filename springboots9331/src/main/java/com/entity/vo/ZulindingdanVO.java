package com.entity.vo;

import com.entity.ZulindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 租赁订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-10 15:56:44
 */
public class ZulindingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房屋类型
	 */
	
	private String fangwuleixing;
		
	/**
	 * 房屋图片
	 */
	
	private String fangwutupian;
		
	/**
	 * 房屋面积
	 */
	
	private String fangwumianji;
		
	/**
	 * 房屋租金
	 */
	
	private Integer fangwuzujin;
		
	/**
	 * 租赁月数
	 */
	
	private Integer zulinyueshu;
		
	/**
	 * 订单金额
	 */
	
	private Integer dingdanjine;
		
	/**
	 * 订单备注
	 */
	
	private String dingdanbeizhu;
		
	/**
	 * 房主账号
	 */
	
	private String fangzhuzhanghao;
		
	/**
	 * 评价状态
	 */
	
	private String pingjiazhuangtai;
		
	/**
	 * 租赁日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zulinriqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：房屋租金
	 */
	 
	public void setFangwuzujin(Integer fangwuzujin) {
		this.fangwuzujin = fangwuzujin;
	}
	
	/**
	 * 获取：房屋租金
	 */
	public Integer getFangwuzujin() {
		return fangwuzujin;
	}
				
	
	/**
	 * 设置：租赁月数
	 */
	 
	public void setZulinyueshu(Integer zulinyueshu) {
		this.zulinyueshu = zulinyueshu;
	}
	
	/**
	 * 获取：租赁月数
	 */
	public Integer getZulinyueshu() {
		return zulinyueshu;
	}
				
	
	/**
	 * 设置：订单金额
	 */
	 
	public void setDingdanjine(Integer dingdanjine) {
		this.dingdanjine = dingdanjine;
	}
	
	/**
	 * 获取：订单金额
	 */
	public Integer getDingdanjine() {
		return dingdanjine;
	}
				
	
	/**
	 * 设置：订单备注
	 */
	 
	public void setDingdanbeizhu(String dingdanbeizhu) {
		this.dingdanbeizhu = dingdanbeizhu;
	}
	
	/**
	 * 获取：订单备注
	 */
	public String getDingdanbeizhu() {
		return dingdanbeizhu;
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
	 * 设置：评价状态
	 */
	 
	public void setPingjiazhuangtai(String pingjiazhuangtai) {
		this.pingjiazhuangtai = pingjiazhuangtai;
	}
	
	/**
	 * 获取：评价状态
	 */
	public String getPingjiazhuangtai() {
		return pingjiazhuangtai;
	}
				
	
	/**
	 * 设置：租赁日期
	 */
	 
	public void setZulinriqi(Date zulinriqi) {
		this.zulinriqi = zulinriqi;
	}
	
	/**
	 * 获取：租赁日期
	 */
	public Date getZulinriqi() {
		return zulinriqi;
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
