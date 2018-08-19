package com.renjz.mapper;

import com.renjz.annotation.Mapper;
import com.renjz.annotation.Sql;
import com.renjz.model.Passport;

/**
 * @author renjingzhi
 *
 */
@Mapper
public interface PassportMapper {

    @Sql("")
    public int insert(Passport passport);

    public Passport selectByPrimaryKey(int id);
}
