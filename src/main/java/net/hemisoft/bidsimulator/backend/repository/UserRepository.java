package net.hemisoft.bidsimulator.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.hemisoft.bidsimulator.domain.Item;


public interface UserRepository extends JpaRepository<Item, Long> {}
