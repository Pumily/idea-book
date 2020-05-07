package com.pokio.ideabook.entity.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author llc
 * @since 2020-05-07
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Long id;

      /**
     * 用户账号
     */
      private String userName;

      /**
     * 密码
     */
      private String pwd;

      /**
     * 用户昵称
     */
      private String nickName;

      /**
     * 用户角色(01-普通，02-会员，03-终身会员)
     */
      private String userRole;

      /**
     * 账号状态(N-正常，D-删除，S-停用)
     */
      private String status;

      /**
     * 创建时间
     */
      private Date createTime;


}
