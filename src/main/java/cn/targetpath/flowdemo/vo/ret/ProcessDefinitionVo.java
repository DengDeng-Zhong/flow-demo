package cn.targetpath.flowdemo.vo.ret;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回流程实例vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:48
 */
@Data
public class ProcessDefinitionVo implements Serializable {

    protected String id;
    protected String modelKey;
    protected String name;
    protected int version;
    protected String category;
    protected String deploymentId;
    protected String resourceName;
    protected String dgrmResourceName;
    protected int suspensionState;
    protected String tenantId;
}
