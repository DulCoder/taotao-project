package com.taotao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by zhengxianyou on 2017/8/20 0020.
 */

public class TestPageHelper {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");

        //从spring容器中获得Mapper的代理对象
        TbItemMapper mapper = context.getBean(TbItemMapper.class);
        //执行查询，并分页
        TbItemExample example = new TbItemExample();
        //分页处理
        PageHelper.startPage(2, 10);
        List<TbItem> list = mapper.selectByExample(example);
        //取商品列表
        for (TbItem tbItem : list) {
            System.out.println(tbItem.getTitle());
        }
        //取分页信息
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        System.out.println("共有商品："+ total);
    }
}
