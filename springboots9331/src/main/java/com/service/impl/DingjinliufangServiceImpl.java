package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DingjinliufangDao;
import com.entity.DingjinliufangEntity;
import com.service.DingjinliufangService;
import com.entity.vo.DingjinliufangVO;
import com.entity.view.DingjinliufangView;

@Service("dingjinliufangService")
public class DingjinliufangServiceImpl extends ServiceImpl<DingjinliufangDao, DingjinliufangEntity> implements DingjinliufangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingjinliufangEntity> page = this.selectPage(
                new Query<DingjinliufangEntity>(params).getPage(),
                new EntityWrapper<DingjinliufangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingjinliufangEntity> wrapper) {
		  Page<DingjinliufangView> page =new Query<DingjinliufangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingjinliufangVO> selectListVO(Wrapper<DingjinliufangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingjinliufangVO selectVO(Wrapper<DingjinliufangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingjinliufangView> selectListView(Wrapper<DingjinliufangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingjinliufangView selectView(Wrapper<DingjinliufangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
