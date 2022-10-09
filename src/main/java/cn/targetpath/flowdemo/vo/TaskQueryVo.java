package cn.targetpath.flowdemo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 任务vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:31
 */
@Data
public class TaskQueryVo implements Serializable {

    /**
     * 用户工号
     */
    private String userCode;
}
