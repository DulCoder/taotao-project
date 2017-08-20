package com.taotao.controller;

import com.taotao.common.pojo.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.geItemById(itemId);
		return tbItem;
	}

	@RequestMapping("/item/list")
	@ResponseBody
	public ResultModel getItemList(Integer page, Integer rows) {
		ResultModel result = itemService.getItemList(page, rows);
		return result;
	}

}
