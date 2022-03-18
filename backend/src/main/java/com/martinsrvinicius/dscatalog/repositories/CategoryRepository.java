package com.martinsrvinicius.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.martinsrvinicius.dscatalog.entities.Category;

//Camada de acesso a dados
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
