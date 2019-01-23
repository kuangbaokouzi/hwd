package kbkz.hwd.mo;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**

数据库表: HWD_HelloWorld

@mbg.generated 自动生成的注释，如需修改本注释，请删除本行
*/
@JsonInclude(Include.NON_NULL)
public class HwdHelloworldMo implements Serializable {
    /**
    
    数据库字段: HWD_HelloWorld.id
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private Long id;

    /**
    
    数据库字段: HWD_HelloWorld.firstName
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String firstname;

    /**
    
    数据库字段: HWD_HelloWorld.lastName
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    private String lastname;

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
    
    数据库字段: HWD_HelloWorld.id
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public Long getId() {
        return id;
    }

    /**
    
    数据库字段: HWD_HelloWorld.id
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setId(Long id) {
        this.id = id;
    }

    /**
    
    数据库字段: HWD_HelloWorld.firstName
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getFirstname() {
        return firstname;
    }

    /**
    
    数据库字段: HWD_HelloWorld.firstName
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
    
    数据库字段: HWD_HelloWorld.lastName
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public String getLastname() {
        return lastname;
    }

    /**
    
    数据库字段: HWD_HelloWorld.lastName
    
    @mbg.generated 自动生成，如需修改，请删除本行
    */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", firstname=").append(firstname);
        sb.append(", lastname=").append(lastname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
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
        HwdHelloworldMo other = (HwdHelloworldMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}