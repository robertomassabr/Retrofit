package com.robertomassa.retrofit.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Funcionario implements Serializable {

    private long idFunc;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("pwd")
    @Expose
    private String pwd;

    /**
     * No args constructor for use in serialization
     *
     */
    public Funcionario() {
    }

    /**
     *
     * @param idFunc
     * @param id
     * @param pwd
     * @param name
     */
    public Funcionario(long idFunc, String id, String name, String pwd) {
        this.idFunc = idFunc;
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    /**
     *
     * @return
     * The idFunc
     */
    public long getIdFunc() {
        return idFunc;
    }

    /**
     *
     * @param idFunc
     * The idFunc
     */
    public void setIdFunc(long idFunc) {
        this.idFunc = idFunc;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     *
     * @param pwd
     * The pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}