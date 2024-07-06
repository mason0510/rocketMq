package com.example.rocketmqdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author authorxx
 * @since 2024-07-06
 */
@Getter
@Setter
  @ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("编号")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("账号ID")
      private String account_id;

      @ApiModelProperty("用户名")
      private String user_name;

      @ApiModelProperty("密码")
      private String password;

      @ApiModelProperty("密码盐")
      private String password_salt;

      @ApiModelProperty("助记词")
      private String mnemonic;

      @ApiModelProperty("1正常 2 冻结 3 删除")
      private String state;

    private LocalDateTime create_time;

    private LocalDateTime update_time;

    private String type;


}
