package com.taotao.service;

import com.taotao.common.pojo.TreeNode;

import java.util.List;

/**
 * Created by zhengxianyou on 2017/8/20 0020.
 */
public interface ItemCatService {

    List<TreeNode> getItemCatList(long parentId);

}
