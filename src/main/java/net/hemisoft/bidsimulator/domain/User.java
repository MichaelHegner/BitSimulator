//package net.hemisoft.bidsimulator.domain;
//
//import static javax.persistence.CascadeType.ALL;
//import static lombok.AccessLevel.PRIVATE;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.validation.constraints.NotNull;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//import lombok.RequiredArgsConstructor;
//
//@Data
//@Entity
//@NoArgsConstructor(access = PRIVATE)
//@RequiredArgsConstructor
//public class User {
//	@Id 												private Long id;
//	@NonNull @NotNull 									private String lastName;
//	@NonNull @NotNull 									private String firstName;
//														private Address address;
//	@OneToMany(cascade = ALL, mappedBy = "bidder")		private final Set<Bid> bids = new HashSet<Bid>();
//	@OneToMany(mappedBy = "seller")						private Collection<Item> itemsForSale = new ArrayList<Item>();
//
//	public String getFullName() {
//		return firstName + " " + lastName;
//	}
//}
