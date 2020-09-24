package com.h3c.mds.flowable.entity;

import java.util.List;

public class PartCodeProcessExt extends PartCodeProcess {

    private List<PartCodeApply> applys;

    public List<PartCodeApply> getApplys() {
        return applys;
    }

    public void setApplys(List<PartCodeApply> applys) {
        this.applys = applys;
    }
}
