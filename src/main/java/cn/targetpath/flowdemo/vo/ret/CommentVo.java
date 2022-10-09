package cn.targetpath.flowdemo.vo.ret;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:38
 */
@Data
public class CommentVo implements Serializable {
    /**
     * 任务id
     */
    protected String taskId;
    /**
     * 添加人
     */
    protected String userId;
    /**
     * 用户的名称
     */
    protected String userName;
    /**
     * 用户的头像链接
     */
    protected String userUrl;
    /**
     * 流程实例id
     */
    protected String processInstanceId;
    /**
     * 意见信息
     */
    protected String message;
    /**
     * 时间
     */
    protected Date time;
    /**
     *  @see  cn.targetpath.flowdemo.enu.CommentTypeEnum
     */
    private String type;
    /**
     * 类型名称
     */
    private String typeName;
    /**
     * 任务名称
     */
    private String taskName;
    /**
     * 评论全信息
     */
    private String fullMsg;
    
    public CommentVo(String userId, String processInstanceId, String type, String message) {
        this.userId = userId;
        this.processInstanceId = processInstanceId;
        this.message = message;
        this.type = type;
    }
    public CommentVo(String taskId, String userId, String processInstanceId,String type, String message) {
        this.taskId = taskId;
        this.userId = userId;
        this.processInstanceId = processInstanceId;
        this.message = message;
        this.type = type;
    }
}
