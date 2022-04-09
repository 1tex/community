package com.nowcoder.community.actuator;

import com.nowcoder.community.util.CommunityUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
@Endpoint(id = "database")
public class DatabaseEndPoint {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseEndPoint.class);

    // 连接池由顶层容器管理，直接注入即可
    @Autowired
    private DataSource dataSource;

    @ReadOperation
    public String checkConnection() {
        try (
                // 小括号里编译时会自动加finally，不用手动加了
                Connection conn = dataSource.getConnection();
        ) {
            return CommunityUtil.getJSONString(0, "获取连接成功");
        } catch (SQLException e) {
            logger.error("获取连接失败" + e.getMessage());
            return CommunityUtil.getJSONString(1, "获取连接失败");
        }
    }

}
