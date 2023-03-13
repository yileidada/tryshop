package com.yilei.tryshop.entity;

import lombok.Data;

@Data
public class ReplanRecode extends BaseDO {
    private Long id;
    private Long questionId;
    private String replanRecode;
}
