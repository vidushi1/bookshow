package com.book.show.bookshow.model;


import lombok.Data;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
public class RowType extends BaseEnumEntity implements Serializable {

//    //bi-directional many-to-one association to Material
//    @OneToMany(mappedBy = "rowType")
//    private Set<Row> row;
}
