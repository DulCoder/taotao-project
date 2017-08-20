package com.taotao.common.pojo;

import java.util.List;

/**
 * Created by zhengxianyou on 2017/8/20 0020.
 */
public class ResultModel {

    private long total;
    private List<?> rows;
    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List<?> getRows() {
        return rows;
    }
    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
