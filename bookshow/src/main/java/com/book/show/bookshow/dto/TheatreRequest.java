package com.book.show.bookshow.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TheatreRequest {

    private String name;

    private AddressRequest addressRequest;

    private PartnerRequest partnerRequest;

    private List<ScreenRequest> screenList = new ArrayList<>();
}
