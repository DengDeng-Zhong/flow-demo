package cn.targetpath.flowdemo.constant;

/**
 * 常量
 *
 * @author DengBo_Zhong
 * @version V1.0
 * @date 2022/10/9 12:01
 */
public class FlowConstant {

    public static final String MAPPER_SCAN = "com.dragon.*.dao.*";

    /**
     * 提交人的变量名称
     */
    public static final String FLOW_SUBMITTER_VAR = "initiator";
    /**
     * 提交人节点名称
     */
    public static final String FLOW_SUBMITTER = "提交人";
    /**
     * 自动跳过节点设置属性
     */
    public static final String FLOWABLE_SKIP_EXPRESSION_ENABLED = "_FLOWABLE_SKIP_EXPRESSION_ENABLED";
    /**
     * 挂起状态
     */
    public static final int SUSPENSION_STATE = 2;
    /**
     * 激活状态
     */
    public static final int ACTIVATE_STATE = 1;
    //后加签
    public static final String AFTER_ADDSIGN = "after";
    //前加签
    public static final String BEFORE_ADDSIGN = "before";

}

