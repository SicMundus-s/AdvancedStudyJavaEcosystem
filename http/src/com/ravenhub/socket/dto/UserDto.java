package com.ravenhub.socket.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public final class UserDto {
    Long id;
    String mail;
}