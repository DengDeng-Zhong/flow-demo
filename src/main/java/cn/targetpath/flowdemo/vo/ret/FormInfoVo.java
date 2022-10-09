package cn.targetpath.flowdemo.vo.ret;

import lombok.Data;

import java.io.Serializable;

/**
 * 表单的信息
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:45
 */
@Data
public class FormInfoVo<T> implements Serializable {
    /**
     * 表单信息
     */
    private T formInfo;
    /**
     * 任务id
     */
    private String taskId;
    /**
     * 流程实例id
     */
    private String processInstanceId;

    public FormInfoVo(){}
    public FormInfoVo(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public FormInfoVo(String taskId, String processInstanceId) {
        this.taskId = taskId;
        this.processInstanceId = processInstanceId;
    }
}
