// src/main/java/com/example/zaff/repository/WikiPageRepository.java
package com.example.zaff.repository;

import com.example.zaff.model.WikiPage;

import io.micrometer.common.lang.Nullable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface WikiPageRepository extends JpaRepository<WikiPage, Long> {


    @Nullable
    WikiPage findTop1ById(Long id);
}
