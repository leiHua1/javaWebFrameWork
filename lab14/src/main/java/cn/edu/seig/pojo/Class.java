package cn.edu.seig.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName tb_class
 */
@TableName(value ="tb_class")
public class Class implements Serializable {
    /**
     * 班级ID
     */
    @TableId(type = IdType.AUTO)
    private Integer classId;

    /**
     * 班级名
     */
    private String className;

    /**
     * 班级人数
     */
    private Integer classSize;

    /**
     * 班级剩余人数
     */
    private Integer classSurplus;

    /**
     * 系ID
     */
    private Integer deptId;

    /**
     * 专业ID
     */
    private String majorId;

    /**
     * 学习导师ID
     */
    private String tutorId;

    /**
     * 辅导员ID
     */
    private String instructorId;

    /**
     * 备注，借用字段
     */
    private String bz;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 班级ID
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 班级ID
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 班级名
     */
    public String getClassName() {
        return className;
    }

    /**
     * 班级名
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 班级人数
     */
    public Integer getClassSize() {
        return classSize;
    }

    /**
     * 班级人数
     */
    public void setClassSize(Integer classSize) {
        this.classSize = classSize;
    }

    /**
     * 班级剩余人数
     */
    public Integer getClassSurplus() {
        return classSurplus;
    }

    /**
     * 班级剩余人数
     */
    public void setClassSurplus(Integer classSurplus) {
        this.classSurplus = classSurplus;
    }

    /**
     * 系ID
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 系ID
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * 专业ID
     */
    public String getMajorId() {
        return majorId;
    }

    /**
     * 专业ID
     */
    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    /**
     * 学习导师ID
     */
    public String getTutorId() {
        return tutorId;
    }

    /**
     * 学习导师ID
     */
    public void setTutorId(String tutorId) {
        this.tutorId = tutorId;
    }

    /**
     * 辅导员ID
     */
    public String getInstructorId() {
        return instructorId;
    }

    /**
     * 辅导员ID
     */
    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    /**
     * 备注，借用字段
     */
    public String getBz() {
        return bz;
    }

    /**
     * 备注，借用字段
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Class other = (Class) that;
        return (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getClassName() == null ? other.getClassName() == null : this.getClassName().equals(other.getClassName()))
            && (this.getClassSize() == null ? other.getClassSize() == null : this.getClassSize().equals(other.getClassSize()))
            && (this.getClassSurplus() == null ? other.getClassSurplus() == null : this.getClassSurplus().equals(other.getClassSurplus()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getMajorId() == null ? other.getMajorId() == null : this.getMajorId().equals(other.getMajorId()))
            && (this.getTutorId() == null ? other.getTutorId() == null : this.getTutorId().equals(other.getTutorId()))
            && (this.getInstructorId() == null ? other.getInstructorId() == null : this.getInstructorId().equals(other.getInstructorId()))
            && (this.getBz() == null ? other.getBz() == null : this.getBz().equals(other.getBz()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getClassName() == null) ? 0 : getClassName().hashCode());
        result = prime * result + ((getClassSize() == null) ? 0 : getClassSize().hashCode());
        result = prime * result + ((getClassSurplus() == null) ? 0 : getClassSurplus().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getMajorId() == null) ? 0 : getMajorId().hashCode());
        result = prime * result + ((getTutorId() == null) ? 0 : getTutorId().hashCode());
        result = prime * result + ((getInstructorId() == null) ? 0 : getInstructorId().hashCode());
        result = prime * result + ((getBz() == null) ? 0 : getBz().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", classId=").append(classId);
        sb.append(", className=").append(className);
        sb.append(", classSize=").append(classSize);
        sb.append(", classSurplus=").append(classSurplus);
        sb.append(", deptId=").append(deptId);
        sb.append(", majorId=").append(majorId);
        sb.append(", tutorId=").append(tutorId);
        sb.append(", instructorId=").append(instructorId);
        sb.append(", bz=").append(bz);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}