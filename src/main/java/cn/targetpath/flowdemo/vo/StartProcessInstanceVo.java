package cn.targetpath.flowdemo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * 启动流程vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:27
 */
@Data
public class StartProcessInstanceVo implements Serializable {

    /**
     * 流程定义key 必填
     */
    private String processDefinitionKey;
    /**
     * 业务系统id 必填
     */
    private String businessKey;
    /**
     * 启动流程变量 选填
     */
    private Map<String, Object> variables;
    /**
     * 申请人工号 必填
     */
    private String currentUserCode;
    /**
     * 系统标识 必填
     */
    private String systemSn;
    /**
     * 表单显示名称 必填
     */
    private String formName;
    /**
     * 流程提交人工号 必填
     */
    private String creator;
}
