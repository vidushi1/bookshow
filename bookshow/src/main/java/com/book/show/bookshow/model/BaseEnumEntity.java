package com.book.show.bookshow.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@MappedSuperclass
@Data
public class BaseEnumEntity implements Serializable {
    @Id
    private String id;

    @NotNull
    @Column(nullable = false)
    protected String name;
}

