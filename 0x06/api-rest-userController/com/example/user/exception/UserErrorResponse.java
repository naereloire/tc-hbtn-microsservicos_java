package com.example.user.exception;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserErrorResponse {
    private int status;
    private String message;
}
