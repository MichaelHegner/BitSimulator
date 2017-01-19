//package net.hemisoft.bidsimulator.domain;
//
//import static lombok.AccessLevel.PRIVATE;
//
//import java.time.Instant;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.Version;
//import javax.validation.constraints.NotNull;
//
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//import lombok.RequiredArgsConstructor;
//
//@Entity
//@NoArgsConstructor(access=PRIVATE)
//@RequiredArgsConstructor
//public class Bid {
//	@Id @GeneratedValue						private Long id;
//	@Version								private int version;
//	@NonNull @NotNull @ManyToOne			private Item item;
//	@NonNull @NotNull @ManyToOne			private User bidder;
//	@NonNull @NotNull @ManyToOne			private User seller;
//	@NonNull @NotNull						private Instant bidTime;
//											private Double amount;
//
//}
