package com.renjz.session;

import com.renjz.executor.Executor;

/**
 * @author renjingzhi
 *
 */
public interface SqlSession {

    public <T> T selectOne(String sql, String... params);

    public Executor getExecutor();
}
