package cn.targetpath.flowdemo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * formInfo查询参数
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:19
 */
@Data
public class FormInfoQueryVo implements Serializable {

    /**
     * 任务id
     */
    private String taskId;
    /**
     * 流程实例id
     */
    private String processInstanceId;
    /**
     * 表单id
     */
    private String businessKey;
}
