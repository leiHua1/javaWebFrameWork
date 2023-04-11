package cn.edu.seig.pojo;

/**
 * @Author leiHua
 * @Date 2022/10/3 16:56
 */
public class ReturnObject {
    private String code;
    private String message;
    private Object retData;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getRetData() {
        return retData;
    }

    public void setRetData(Object retData) {
        this.retData = retData;
    }
}
