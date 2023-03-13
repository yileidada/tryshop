package com.yilei.tryshop.entity;

import lombok.Data;

@Data
public class LiableOwner extends BaseDO {
    private Long id;
    private String name;
    private String nickName;
    private String workNo;
    private String email;
    private String tel;
    private String dingdingNo;

}
