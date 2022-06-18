package com.book.show.bookshow.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressRequest {

    private String address_line1;
    private String address_line2;
    private String city;
    private String state;
    private String zipcode;
}
