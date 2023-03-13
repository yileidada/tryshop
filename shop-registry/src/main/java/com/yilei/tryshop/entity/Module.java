package com.yilei.tryshop.entity;


import lombok.Data;

@Data
public class Module extends BaseDO {
    private Long id;
    private String name;
    private Long ownerId;
    private String describe;
}
