package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.scu.db.demo.model.Title;

import java.util.List;
@Mapper
public interface TitleMapper {
    @Select("select * from title where name = 'Iliad' or name='Odyssey'")
    List<Title> findIliadOrOdysseyTitle();


}
