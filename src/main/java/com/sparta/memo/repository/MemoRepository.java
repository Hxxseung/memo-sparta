package com.sparta.memo.repository;

import com.sparta.memo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();    //해당 메서드 이름을 분석해서 SimpleJPARepository에서 구현이 됨. -> 따로 SQL 쿼리문을 구현하지 않아도 되는 장점
    //List<Memo> findAllByUsername(String username); //username 이 작성한 모든 메모 내용을 갖고옴 -> 동적 처리
}