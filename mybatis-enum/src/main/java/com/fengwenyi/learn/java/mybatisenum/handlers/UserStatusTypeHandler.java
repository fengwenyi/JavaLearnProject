package com.fengwenyi.learn.java.mybatisenum.handlers;

import com.fengwenyi.learn.java.mybatisenum.Status;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Wenyi Feng
 */

@MappedTypes({Status.class})
public class UserStatusTypeHandler implements TypeHandler<Status> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, Status status, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, status.getCode());
    }

    @Override
    public Status getResult(ResultSet resultSet, String s) throws SQLException {
        Integer code = resultSet.getInt(s);
        return Status.getStatusByCode(code);
    }

    @Override
    public Status getResult(ResultSet resultSet, int i) throws SQLException {
        Integer code = resultSet.getInt(i);
        return Status.getStatusByCode(code);
    }

    @Override
    public Status getResult(CallableStatement callableStatement, int i) throws SQLException {
        Integer code = callableStatement.getInt(i);
        return Status.getStatusByCode(code);
    }
}
