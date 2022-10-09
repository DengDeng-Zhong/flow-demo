package cn.targetpath.flowdemo.vo.ret;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:53
 */
@Data
public class UserVo implements Serializable {
    /**
     * 工号
     */
    private String id;
    /**
     * 用户的真实姓名
     */
    private String displayName;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 头像的类型
     */
    protected String mimeType;
    /**
     * 头像
     */
    private byte[] picture;

    /*************************扩展字段*****************************/
    /**
     * 离职状态 1:未离职；0:已离职
     */
    private Integer status;
    /**
     *
     * 标记用户是否是授权用户
     */
    private String privFlag;
    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 公司id
     */
    private String companyId;
    /**
     * 部门id
     */
    private String departmentId;
}
