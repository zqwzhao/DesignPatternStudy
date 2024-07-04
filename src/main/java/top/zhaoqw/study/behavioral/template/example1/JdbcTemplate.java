package top.zhaoqw.study.behavioral.template.example1;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author zhaoqw
 * @date 2024/7/4
 */
public class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public final List<?> executorQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            // 1. 获取链接
            Connection conn = this.getConnection();
            // 2. 创建语句集
            PreparedStatement pst = this.createPrepareStatement(conn, sql);
            // 3. 执行语句集

            // 4. 处理结果集
            // 5. 关闭结果集
            // 6. 关闭语句集
            // 7. 关闭链接
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

        }


        return null;
    }

    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
