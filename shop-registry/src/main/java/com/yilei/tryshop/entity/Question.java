package com.yilei.tryshop.entity;

import lombok.Data;

@Data
public class Question extends BaseDO {

    private Long id;
    private int type;
    private String describeInfo;
    private String submiter;
    private int solveFlag;
    private String docLink;
    private Double solveDuration;
    private String cause;
    private String hackPlan;
    private String envLink;
    private int deleteFlag;

}
