package com.taotao.controller;

import com.taotao.common.pojo.TreeNode;
import com.taotao.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhengxianyou on 2017/8/20 0020.
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {
    /**
     * 商品分类管理controller
     * <p>Title: ItemCatController</p>
     */

        @Autowired
        private ItemCatService itemCatService;

        @RequestMapping("/list")
        @ResponseBody
        private List<TreeNode> getCatList(@RequestParam(value="id",defaultValue="0")Long parentId) {
            List<TreeNode> list = itemCatService.getItemCatList(parentId);
            return list;
        }
}
