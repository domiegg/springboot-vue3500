package com.entity.view;

import com.entity.DingjinliufangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 定金留房
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 15:56:44
 */
@TableName("dingjinliufang")
public class DingjinliufangView  extends DingjinliufangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingjinliufangView(){
	}
 
 	public DingjinliufangView(DingjinliufangEntity dingjinliufangEntity){
 	try {
			BeanUtils.copyProperties(this, dingjinliufangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
