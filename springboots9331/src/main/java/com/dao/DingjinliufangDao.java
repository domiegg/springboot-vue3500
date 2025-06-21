package com.dao;

import com.entity.DingjinliufangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingjinliufangVO;
import com.entity.view.DingjinliufangView;


/**
 * 定金留房
 * 
 * @author 
 * @email 
 * @date 2022-04-10 15:56:44
 */
public interface DingjinliufangDao extends BaseMapper<DingjinliufangEntity> {
	
	List<DingjinliufangVO> selectListVO(@Param("ew") Wrapper<DingjinliufangEntity> wrapper);
	
	DingjinliufangVO selectVO(@Param("ew") Wrapper<DingjinliufangEntity> wrapper);
	
	List<DingjinliufangView> selectListView(@Param("ew") Wrapper<DingjinliufangEntity> wrapper);

	List<DingjinliufangView> selectListView(Pagination page,@Param("ew") Wrapper<DingjinliufangEntity> wrapper);
	
	DingjinliufangView selectView(@Param("ew") Wrapper<DingjinliufangEntity> wrapper);
	

}
