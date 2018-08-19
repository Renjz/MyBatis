package com.renjz.session.imp;

import com.renjz.conf.Configuration;
import com.renjz.executor.Executor;
import com.renjz.session.SqlSession;

/**
 * @author renjingzhi
 *
 */
public class SimpleSqlSession implements SqlSession {

    private Configuration config;
    private Executor executor;

    public SimpleSqlSession(Configuration config, Executor executor) {
        this.config = config;
        this.executor = executor;
    }

    @Override
    public <T> T selectOne(String sql, String... params) {
        return this.executor.query(sql, params);
    }

    @Override
    public Executor getExecutor() {
        return this.executor;
    }

}
