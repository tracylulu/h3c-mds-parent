package com.h3c.mds.flowable.strategy;

import java.util.List;

public interface Strategy<F, T> {

    //实现类根据业务实现从不同的数据来源取，
    List<F> getSourceData(F f);
    
    List<F> doGetSourceData(F f);
    // 数据转换
    List<T> transferPOJO(List<F> fromPOJOs);
    //保存数据
    //实现类根据业务实现保存不同的数据库，或者保存到文件
    int saveData(List<T> toPOJOs);
}
