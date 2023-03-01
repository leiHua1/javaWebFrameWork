package personal.leihua.lab02.pojo;

import java.util.List;

/**
 * 系别类
 */
public class Dept{
    private Integer deptId;//系别ID
    private String deptname;//系名
    //为属性提供setter和getter方法


    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }


}
