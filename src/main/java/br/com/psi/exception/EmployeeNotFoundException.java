package br.com.psi.exception;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeNotFoundException extends RuntimeException {
    private final long employeeId;

    public String getMessage() {
        return "Employee with ID '" + employeeId + "' was not found";
    }
}
