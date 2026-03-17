package com.lisa.webmvc.exception;

import lombok.Builder;

@Builder
public record FiledErrorResponse(String field, String reason) {
}
