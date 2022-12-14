package cn.targetpath.flowdemo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 流程执行过程中的基本参数VO
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:06
 */
@Data
public class BaseProcessVo implements Serializable  {
    /**********************任务相关的参数**********************/
    /**
     * 任务id 必填
     */
    private String taskId;
    /**********************审批意见的参数**********************/
    /**
     * 操作人code 必填
     */
    private String userCode;
    /**
     * 审批意见 必填
     */
    private String message;
    /**
     * 流程实例的id 必填
     */
    private String processInstanceId;
    /**
     * 审批类型 必填
     */
    private String type;
}
