package com.cn.myself.entity;

import java.io.Serializable;

/**
 * Created by xiaolin.zhang on 2017/2/21.
 */

    public  class PersonEntity implements Serializable {
        private Object obj;
        private int id;
        private String name;
        private int i;
        public int addI(){
            i++;
            return i;
        }
        public PersonEntity() {
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

