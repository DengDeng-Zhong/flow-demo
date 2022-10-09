package cn.targetpath.flowdemo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * modelVo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:20
 */
@Data
public class ModelVo implements Serializable {
    /**
     * 流程id
     */
    private String processId;
    /**
     * 流程名称
     */
    private String processName;
    /**
     * 分类Id
     */
    private String categoryId;
    /**
     * 流程的xml
     */
    private String xml;

}
