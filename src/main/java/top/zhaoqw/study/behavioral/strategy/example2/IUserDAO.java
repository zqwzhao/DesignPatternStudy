package top.zhaoqw.study.behavioral.strategy.example2;

import top.zhaoqw.study.behavioral.strategy.example2.agent.Select;

/**
 * @author zhaoqw
 * @date 2022/07/15
 */
public interface IUserDAO {

  @Select("select userName from user where id = #{userId}")
  String queryUserInfo(String userId);
}
