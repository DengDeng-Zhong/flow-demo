package cn.targetpath.flowdemo.vo;

import lombok.Data;

/**
 * 转办vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:32
 */
@Data
public class TurnTaskVo extends BaseProcessVo {

    /**
     * 被转办人工号 必填
     */
    private String turnToUserId;
}
