package net.hemisoft.bidsimulator.domain;

import static lombok.AccessLevel.PRIVATE;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor(access = PRIVATE)
@RequiredArgsConstructor
public class Category {
    @Id @GeneratedValue				private Long id;
    @Version						private int version;
    @NonNull @NotNull				private String name;
    @ManyToMany	@Getter				private List<Item> items = new ArrayList<Item>();
}
