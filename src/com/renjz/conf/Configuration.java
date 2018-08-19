package com.renjz.conf;

/**
 * @author renjingzhi
 *
 */
public interface Configuration {

    public <T> T getMapper(Class<T> clazz);
}
