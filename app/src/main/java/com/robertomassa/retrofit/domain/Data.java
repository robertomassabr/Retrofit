package com.robertomassa.retrofit.domain;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("data")
    @Expose
    private List<Funcionario> data = new ArrayList<Funcionario>();

    @SerializedName("func")
    @Expose
    private Funcionario func = new Funcionario();

    /**
     * No args constructor for use in serialization
     *
     */
    public void Data() {
    }

    /**
     *
     * @param data
     */
    public Data(List<Funcionario> data) {
        this.data = data;
    }

    /**
     *
     * @return
     * The data
     */
    public List<Funcionario> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<Funcionario> data) {
        this.data = data;
    }

    public Funcionario getFuncionario() {
        return func;
    }

    public void setFuncionario(Funcionario func) {
        this.func = func;
    }

}