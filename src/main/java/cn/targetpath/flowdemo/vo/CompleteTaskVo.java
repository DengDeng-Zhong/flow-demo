package cn.targetpath.flowdemo.vo;

import lombok.Data;

import java.util.Map;

/**
 * 执行任务vo
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:12
 */
@Data
public class CompleteTaskVo extends BaseProcessVo {
    /**
     * 任务参数 选填
     */
    private Map<String, Object> variables;

}
