package org.fuelteam.watt.result;

import java.io.Serializable;

public class PageRequest implements Serializable {

    private static final long serialVersionUID = 5542231505742544329L;

    private Integer p = 1;

    private Integer size = 20;

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
}