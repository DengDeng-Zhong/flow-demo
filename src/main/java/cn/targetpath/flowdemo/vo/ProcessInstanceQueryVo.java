package cn.targetpath.flowdemo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询流程实例vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:26
 */
@Data
public class ProcessInstanceQueryVo implements Serializable {

    private String formName;
    private String userCode;
    private String userName;
}
