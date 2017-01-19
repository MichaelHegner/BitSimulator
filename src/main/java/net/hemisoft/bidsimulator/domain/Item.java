package net.hemisoft.bidsimulator.domain;

import static lombok.AccessLevel.PRIVATE;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access=PRIVATE)
public class Item  {
	@Id @GeneratedValue 				private Long id;
	@Version							private int version;
	@NotNull							private String name;
	 									private String description;
	 									private double initialPrice;
	 									private Instant startDate;
	 									private Instant endDate;
	 									private Instant createdDate;
	@Enumerated(EnumType.STRING)		private ItemState state;
	 									
	@ManyToOne(fetch = FetchType.LAZY)	private User seller;
	@ManyToOne(fetch = FetchType.LAZY)	private User buyer;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY) 
	private List<Bid> bids = new ArrayList<Bid>();
	
    @ManyToMany(mappedBy = "items")
    private Set<Category> categories = new HashSet<Category>();
}
