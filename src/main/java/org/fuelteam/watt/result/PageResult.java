package org.fuelteam.watt.result;

import java.io.Serializable;
import java.util.List;

public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 6033008376958365380L;

    private Object extra;

    private Long total;

    @SuppressWarnings("unused")
    private boolean hasMore;

    private Integer p = 1;

    private Integer size = 20;

    private List<T> data;

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public boolean hasMore() {
        return (total - p * size) > 0;
    }

    public Integer getP() {
        return p;
    }

    public void setP(Integer p) {
        this.p = p;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
