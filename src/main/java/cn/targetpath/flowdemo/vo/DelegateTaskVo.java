package cn.targetpath.flowdemo.vo;

import lombok.Data;

/**
 * 委派vo
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 16:18
 */
@Data
public class DelegateTaskVo extends BaseProcessVo {
    /**
     * 委派人
     */
    private String delegateUserCode;
}
