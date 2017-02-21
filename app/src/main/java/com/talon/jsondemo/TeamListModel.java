package com.talon.jsondemo;

import java.util.List;

/**
 * Created by Talon on 2017/2/21.
 */

public class TeamListModel {

    /**
     * total : 6
     * rows : [{"page":null,"rows":null,"q":null,"insertRole":null,"updateRole":null,"deleteRole":null,"id":1,"paramVal":"0","paramName":"景区观光","state":0,"explainName":"目的属性","proctime":"2016-11-30 16:47:56","back1":null,"back2":null,"start":null},{},{},{},{},{}]
     * footer : null
     */

    private int total;
    private Object footer;
    private List<RowsBean> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Object getFooter() {
        return footer;
    }

    public void setFooter(Object footer) {
        this.footer = footer;
    }

    public List<RowsBean> getRows() {
        return rows;
    }

    public void setRows(List<RowsBean> rows) {
        this.rows = rows;
    }

    public static class RowsBean {
        /**
         * page : null
         * rows : null
         * q : null
         * insertRole : null
         * updateRole : null
         * deleteRole : null
         * id : 1
         * paramVal : 0
         * paramName : 景区观光
         * state : 0
         * explainName : 目的属性
         * proctime : 2016-11-30 16:47:56
         * back1 : null
         * back2 : null
         * start : null
         */

        private Object page;
        private Object rows;
        private Object q;
        private Object insertRole;
        private Object updateRole;
        private Object deleteRole;
        private int id;
        private String paramVal;
        private String paramName;
        private int state;
        private String explainName;
        private String proctime;
        private Object back1;
        private Object back2;
        private Object start;

        public Object getPage() {
            return page;
        }

        public void setPage(Object page) {
            this.page = page;
        }

        public Object getRows() {
            return rows;
        }

        public void setRows(Object rows) {
            this.rows = rows;
        }

        public Object getQ() {
            return q;
        }

        public void setQ(Object q) {
            this.q = q;
        }

        public Object getInsertRole() {
            return insertRole;
        }

        public void setInsertRole(Object insertRole) {
            this.insertRole = insertRole;
        }

        public Object getUpdateRole() {
            return updateRole;
        }

        public void setUpdateRole(Object updateRole) {
            this.updateRole = updateRole;
        }

        public Object getDeleteRole() {
            return deleteRole;
        }

        public void setDeleteRole(Object deleteRole) {
            this.deleteRole = deleteRole;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getParamVal() {
            return paramVal;
        }

        public void setParamVal(String paramVal) {
            this.paramVal = paramVal;
        }

        public String getParamName() {
            return paramName;
        }

        public void setParamName(String paramName) {
            this.paramName = paramName;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public String getExplainName() {
            return explainName;
        }

        public void setExplainName(String explainName) {
            this.explainName = explainName;
        }

        public String getProctime() {
            return proctime;
        }

        public void setProctime(String proctime) {
            this.proctime = proctime;
        }

        public Object getBack1() {
            return back1;
        }

        public void setBack1(Object back1) {
            this.back1 = back1;
        }

        public Object getBack2() {
            return back2;
        }

        public void setBack2(Object back2) {
            this.back2 = back2;
        }

        public Object getStart() {
            return start;
        }

        public void setStart(Object start) {
            this.start = start;
        }
    }
}
