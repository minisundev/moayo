package com.moayo.moayoeats.domain.post.dto.request;

import com.moayo.moayoeats.domain.post.entity.CategoryEnum;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record PostRequest(

    @NotBlank
    String address,
    @NotBlank
    String store,
    @NotNull
    Long minPrice,
    @NotNull
    Long deliveryCost,

    @NotNull
    @Max(59)
    Integer deadlineMins,
    @NotNull
    @Max(3)
    Integer deadlineHours,
    CategoryEnum category

    ) {

}
