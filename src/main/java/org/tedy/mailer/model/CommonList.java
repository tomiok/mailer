package org.tedy.mailer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.*;

/**
 * Created by tadeo on 13/1/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = CommonList.Builder.class)
public class CommonList<T> {
    protected java.util.List<T> list;
    protected int total_items;

    public CommonList(java.util.List<T> list) {
        this.list = list;
    }

    public java.util.List<T> getList() {
        return list;
    }
    public void setList(java.util.List<T> list) {
        this.list = list;
    }

    public int getTotal_items() {
        return total_items;
    }
    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public static class Builder<T> {
        private java.util.List<T> list;

        public Builder<T> withData(java.util.List<T> list) {
            this.list = list;
            return this;
        }

        public CommonList<T> build() {
            return new CommonList<T>(list);
        }
    }
}