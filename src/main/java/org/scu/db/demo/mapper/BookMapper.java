package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.scu.db.demo.model.Book;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    List<Book> queryBook();
    List<Map> query_call_and_count();
    @Select("select book_id from book")
    List<Integer> findAllBorrowedBooksId();
    @Select("select count(*) from book where CallNumber='Call123'")
    Integer countCall123Book();
    @Select("select CallNumber from book group by CallNumber having count(*)<3")
    List<String> findCountNotExceed2Callnumber();
}
