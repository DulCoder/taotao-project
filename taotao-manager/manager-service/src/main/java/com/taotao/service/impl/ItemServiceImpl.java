package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.ResultModel;
import com.taotao.common.pojo.TreeNode;
import com.taotao.mapper.TbContentCategoryMapper;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;


@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem geItemById(long itemId) {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);   //根据id单个查询
				//添加查询条件
//				TbItemExample example = new TbItemExample();
//				TbItemExample.Criteria criteria = example.createCriteria();
//				criteria.andIdEqualTo(itemId);
//				List<TbItem> list = itemMapper.selectByExample(example);
//				if (list != null && list.size() > 0) {
//					TbItem item = list.get(0);
//					return item;
//				}
		if (item != null){

			return item;
		}
		return null;
	}

	@Override
	public ResultModel getItemList(int page, int rows) {

		//查询商品列表
		TbItemExample example = new TbItemExample();
		//分页处理
		PageHelper.startPage(page, rows);
		List<TbItem> list = itemMapper.selectByExample(example);
		//创建一个返回值对象
		ResultModel result = new ResultModel();
		result.setRows(list);
		//取记录总条数
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}

}
