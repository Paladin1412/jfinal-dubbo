package com.kakarote.crm9.common.config.paragetter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.jfinal.kit.Kv;

import java.util.Objects;

/**
 * 通用分页插件
 * date 2019年1月28日18:06:10
 *
 * @param <T>
 * @author zhangzhiwei
 */
public class BasePageRequest<T> {

    private static final Integer DEFAULT_PAGE = 1;
    private static final Integer DEFAULT_PAGE_SIZE = 20;

    /**
     * 页数 默认1
     */
    private int page;
    /**
     * 每页条数 默认10
     */
    private int limit;
    /**
     * 数据对象
     */
    private T data;
    /**
     * 分页类型
     */
    private Integer pageType;

    private JSONObject jsonObject;


    @Deprecated
    public BasePageRequest(int page, int limit) {
        this.page = page;
        this.limit = limit;
    }

    public BasePageRequest(Kv kv,Class<T> clazz) {
        this(kv.toJson(),clazz);
    }

    public BasePageRequest(Integer page, Integer limit, T param) {
        this.page = Objects.isNull(page) ? DEFAULT_PAGE : page;
        this.limit = Objects.isNull(limit) ? DEFAULT_PAGE_SIZE : limit;
        this.data = param;
    }

    public BasePageRequest(String rowData,Class<T> clazz) {
        JSONObject jsonObject = JSON.parseObject(rowData);
        this.setJsonObject(jsonObject);
        this.setPage(getIntAndRemove("page", 1));
        this.setLimit(getIntAndRemove("limit", 10));
        this.setPageType(getIntAndRemove("pageType", 1));
        if(clazz!=null){
            this.setData(jsonObject.toJavaObject(clazz));
        }
    }

    public int getPage() {
        return page;
    }

    private void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    private void setLimit(int limit) {
        this.limit = limit;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public final BasePageRequest<T> setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
        return this;
    }

    public T getData() {
        return data;
    }

    public final void setData(T data) {
        this.data = data;
    }

    public Integer getPageType() {
        return pageType;
    }

    public final BasePageRequest<T> setPageType(Integer pageType) {
        this.pageType = pageType;
        return this;
    }

    private Integer getIntAndRemove(String key, Object defaultValue) {
        if (this.getJsonObject() == null) {
            throw new RuntimeException("jsonObject cannot be null");
        }
        Object obj = jsonObject.getOrDefault(key, defaultValue);
        jsonObject.remove(key);
        return TypeUtils.castToInt(obj);
    }
}

