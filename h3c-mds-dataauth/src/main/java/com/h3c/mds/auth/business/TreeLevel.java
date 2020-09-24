package com.h3c.mds.auth.business;

/**
 * 树层级对象
 */
public class TreeLevel {

    private String level;

    private String tableName;

    private String conditionFieldName;

    private String queryFieldName;

    private String fieldName;

    public TreeLevel() {
    }

    public TreeLevel(String level) {
        this.level = level;
    }

    public TreeLevel(String level, String tableName, String conditionFieldName, String queryFieldName, String fieldName) {
        this.level = level;
        this.tableName = tableName;
        this.conditionFieldName = conditionFieldName;
        this.queryFieldName = queryFieldName;
        this.fieldName = fieldName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getConditionFieldName() {
        return conditionFieldName;
    }

    public void setConditionFieldName(String conditionFieldName) {
        this.conditionFieldName = conditionFieldName;
    }

    public String getQueryFieldName() {
        return queryFieldName;
    }

    public void setQueryFieldName(String queryFieldName) {
        this.queryFieldName = queryFieldName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
