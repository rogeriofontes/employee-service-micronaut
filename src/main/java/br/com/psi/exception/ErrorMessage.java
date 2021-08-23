package br.com.psi.exception;

import lombok.Value;

@Value
public class ErrorMessage {
    String message;
    String errorCode;
}
