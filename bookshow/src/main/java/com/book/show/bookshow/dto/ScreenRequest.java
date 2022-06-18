package com.book.show.bookshow.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScreenRequest {

    private Long screen_id;
    private Integer capacity;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;

//    public void setDateTime(String dateTime) {
//        if (ObjectUtils.isNotEmpty(dateTime)) {
//            this.dateTime = LocalDateTime.parse(dateTime,
//                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//        }
//    }
    private List<S_RowRequest> rowList = new ArrayList<>();
}