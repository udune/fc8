package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// MyBatis -> JPA
@Repository // JpaRepository -> CRUD Method 정의(Table, PK)
public interface BookRepository extends JpaRepository<Book, Long> {
    // CRUD 기능정의 --> X
    // JPA 에서 제공해주는 메서드를 사용
    // 1. 전체리스트 가져오기 - findAll()...
    // - 데이터 저장하기 - save()
    // - 특정 데이터 가져오기 - findById()
    // + 트랜잭션 처리(All or Nothing)
    // - 특정 데이터 수정하기 - save() : 기존의 PK 값이 존재하면 -> update SQL
    // 데이터가 저장되는 공간 : 영속성(일관성, 정보가 항상 일치) 메모리 (자동더티체킹)
    // Book(Object)(수정) <---------------> book(Table)
}
// interface BookRepository
/*
    public class EntityManagerFactory SqlSessionFactory implements BookRepository {

    }

    Hibernate:
    select
        b1_0.id,
        b1_0.author,
        b1_0.page,
        b1_0.price,
        b1_0.title
    from
        book b1_0

    Hibernate:
    select
        b1_0.id,
        b1_0.author,
        b1_0.page,
        b1_0.price,
        b1_0.title
    from
        Book b1_0
    where
        b1_0.id=?

    Hibernate:
    update
        Book
    set
        author=?,
        page=?,
        price=?,
        title=?
    where
        id=?
 */