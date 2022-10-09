package cn.targetpath.flowdemo.vo.ret;

import lombok.Data;

import java.io.Serializable;

/**
 * 关联审批表
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:48
 */
@Data
public class IdentitylinkVo implements Serializable {

    private String id;
    private String type;
    private String groupId;
    private String userId;
    private String taskId;
    private String processInstanceId;
    private String processDefinitionId;
}
