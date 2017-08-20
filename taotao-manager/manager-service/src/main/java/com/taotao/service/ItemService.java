package com.taotao.service;

import com.taotao.common.pojo.ResultModel;
import com.taotao.common.pojo.TreeNode;
import com.taotao.pojo.TbItem;

import java.util.List;

public interface ItemService {

   TbItem geItemById(long itemId);

   ResultModel getItemList(int page, int rows);

}
