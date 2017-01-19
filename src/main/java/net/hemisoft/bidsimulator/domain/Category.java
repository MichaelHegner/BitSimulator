//package net.hemisoft.bidsimulator.domain;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Version;
//import javax.validation.constraints.NotNull;
//
//import lombok.AccessLevel;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//import lombok.RequiredArgsConstructor;
//
//@Entity
//@Data
//@NoArgsConstructor(access=AccessLevel.PRIVATE)
//@RequiredArgsConstructor
//public class Category {
//    @Id @GeneratedValue				private Long id;
//    @Version						private int version;
//    @NonNull @NotNull				private String name;
//    @ManyToMany	@Getter				private List<Item> items = new ArrayList<Item>();
//}
