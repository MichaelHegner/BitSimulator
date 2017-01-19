package net.hemisoft.bidsimulator.domain;

import javax.persistence.Embeddable;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
@Embeddable
public class Address {
									private String street;
									private String streetNumber;
	@Pattern(regexp = "\\d{4,5}")	private String zip;
									private String city;
}
