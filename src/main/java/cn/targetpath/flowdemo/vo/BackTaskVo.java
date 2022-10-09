package cn.targetpath.flowdemo.vo;

import lombok.Data;

/**
 * 驳回的实体
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:06
 */
@Data
public class BackTaskVo extends BaseProcessVo {

    /**
     * 需要驳回的节点id 必填
     */
    private String distFlowElementId;

}

