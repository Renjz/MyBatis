package com.renjz.executor;

/**
 * @author renjingzhi
 *
 */
public interface Executor {

    /**
     * @param sql
     * @param params
     * @return
     */
    <T> T query(String sql, Object... params);

}
