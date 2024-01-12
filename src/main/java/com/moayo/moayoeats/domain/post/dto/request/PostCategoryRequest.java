package com.moayo.moayoeats.domain.post.dto.request;

import com.moayo.moayoeats.domain.post.exception.validator.Category;
import jakarta.validation.constraints.NotNull;

public record PostCategoryRequest(@NotNull @Category String category) {

}
