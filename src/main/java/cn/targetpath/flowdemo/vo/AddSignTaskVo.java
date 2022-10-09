package cn.targetpath.flowdemo.vo;

import lombok.Data;

import java.util.List;

/**
 * 加签
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 15:49
 */
@Data
public class AddSignTaskVo extends BaseProcessVo {
    /**
     * 被加签人
     */
    private List<String> signPersoneds;

}
