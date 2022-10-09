package cn.targetpath.flowdemo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 流程定义查询vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:25
 */
@Data
public class ProcessDefinitionQueryVo implements Serializable {

    private String name;
    private String modelKey;

}
