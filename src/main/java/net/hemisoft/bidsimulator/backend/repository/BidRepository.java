package net.hemisoft.bidsimulator.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.hemisoft.bidsimulator.domain.Bid;


public interface BidRepository extends JpaRepository<Bid, Long> {}
