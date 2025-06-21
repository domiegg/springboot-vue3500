package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingjinliufangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingjinliufangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingjinliufangView;


/**
 * 定金留房
 *
 * @author 
 * @email 
 * @date 2022-04-10 15:56:44
 */
public interface DingjinliufangService extends IService<DingjinliufangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingjinliufangVO> selectListVO(Wrapper<DingjinliufangEntity> wrapper);
   	
   	DingjinliufangVO selectVO(@Param("ew") Wrapper<DingjinliufangEntity> wrapper);
   	
   	List<DingjinliufangView> selectListView(Wrapper<DingjinliufangEntity> wrapper);
   	
   	DingjinliufangView selectView(@Param("ew") Wrapper<DingjinliufangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingjinliufangEntity> wrapper);
   	

}

