package net.hemisoft.bidsimulator.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.hemisoft.bidsimulator.domain.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {}
