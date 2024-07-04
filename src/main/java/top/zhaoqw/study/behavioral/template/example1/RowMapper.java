package top.zhaoqw.study.behavioral.template.example1;

import java.sql.ResultSet;

/**
 * @author zhaoqw
 * @date 2024/7/4
 */
public interface RowMapper<T> {
    T mapRow(ResultSet set, int rowNumber) throws Exception;
}
