package com.example.validate.exvalidate.domain;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.example.validate.exvalidate.validation.LimitSearchPeriod;
import com.example.validate.exvalidate.validation.ValidPeriod;
import com.fasterxml.jackson.annotation.JsonInclude;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@LimitSearchPeriod(message = "조회 기간은 90일 이내여야 합니다.")
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class SearchDto implements ValidPeriod {

    @NotNull(message = "keyword가 명시되어야 합니다.")
    private String keyword;

    @NotNull(message = "기간 시작 일자가 명시되어야 합니다.")
    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDate startDate;

    @NotNull(message = "기간 종료 일자가 명시되어야 합니다.")
    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDate endDate;

    public SearchDto() {
    }

    public SearchDto(String keyword, LocalDate startDate, LocalDate endDate) {
        this.keyword = keyword;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // 여기!!!
    @Override
    public boolean isValidPeriod() {
        // 개별 속성에 유효하지 않은 값이 들어오면 null 이 할당된다.
        if (startDate == null || endDate == null)
            return false;

        return endDate.isBefore(startDate.plusMonths(3)) && (endDate.isEqual(startDate) || endDate.isAfter(startDate));
    }

    @Override
    public String toString() {
        return "SearchDto{" + "keyword='" + keyword + '\'' + ", startDate='" + startDate + '\'' + ", endDate='"
                + endDate + '\'' + '}';
    }
}
