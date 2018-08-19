package com.renjz.conf.imp;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.renjz.annotation.Mapper;
import com.renjz.conf.Configuration;

/**
 * @author renjingzhi
 *
 */
public class SimpleConfiguration implements Configuration {

    public final Map<String, Map<String, Method>> MAPPER_REGISTERY = new HashMap<String, Map<String, Method>>();

    private SimpleConfiguration() {
        scanAnnotation(new File(SimpleConfiguration.class.getClassLoader().getResource("/").getPath()));
        System.out.println(MAPPER_REGISTERY);
    }

    private void scanAnnotation(File f) {
        File[] subFiles = f.listFiles();
        for (File file : subFiles) {
            if (file.isFile()) {
                if (file.getName().endsWith(".java")) {
                    Class clazz = null;
                    try {
                        clazz = Class.forName(file.getPath());
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                        continue;
                    }
                    if (clazz.isAnnotationPresent(Mapper.class)) {
                        Map<String, Method> mapper = new HashMap<String, Method>();
                        for (Method method : clazz.getMethods()) {
                            if (!Object.class.equals(method.getClass())) {
                                mapper.put(method.getName(), method);
                            }
                        }
                        MAPPER_REGISTERY.put(clazz.getName(), mapper);
                    }
                }
            } else {
                scanAnnotation(file);
            }
        }
    }

    @Override
    public <T> T getMapper(Class<T> clazz) {
        return null;
    }
}
