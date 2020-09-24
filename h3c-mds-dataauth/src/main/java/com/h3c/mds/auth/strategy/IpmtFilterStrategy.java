package com.h3c.mds.auth.strategy;

import com.h3c.mds.auth.business.TreeLevel;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component("baseFilterStrategy")
public class IpmtFilterStrategy extends AbstractFilterStrategy {

    @Override
    protected TreeLevel getTreeLevel() {
        return null;
    }
}
