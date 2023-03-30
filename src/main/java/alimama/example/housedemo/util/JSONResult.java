package alimama.example.housedemo.util;

import java.io.Serializable;

public class JSONResult<E> implements Serializable {
    private Integer state;
    private String message;
    private E data;

    public JSONResult() {
    }

    public JSONResult(Integer state) {
        this.state = state;
    }

    public JSONResult(Integer state, E data) {
        this.state = state;
        this.data = data;
    }

    //如果有错误，打印错误信息传到message中
    public JSONResult(Throwable e) {
        this.message = e.getMessage();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
