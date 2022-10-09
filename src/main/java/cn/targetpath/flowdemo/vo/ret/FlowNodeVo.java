package cn.targetpath.flowdemo.vo.ret;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 流程节点vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:43
 */
@Data
public class FlowNodeVo implements Serializable {
    /**
     * 节点id
     */
    private String nodeId;
    /**
     * 节点名称
     */
    private String nodeName;
    /**
     * 执行人的code
     */
    private String userCode;
    /**
     * 执行人姓名
     */
    private String userName;

    /**
     * 任务节点结束时间
     */
    private Date endTime;

}
