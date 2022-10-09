package cn.targetpath.flowdemo.vo.ret;

import lombok.Data;

import java.io.Serializable;

/**
 * 组的vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:47
 */
@Data
public class GroupVo implements Serializable {

    /**
     * 组的id
     */
    private String id;
    /**
     * 组的名称
     */
    private String groupName;
    /****************************扩展字段****************************/
    /**
     * 组的标识
     */
    private String groupSn;
}
