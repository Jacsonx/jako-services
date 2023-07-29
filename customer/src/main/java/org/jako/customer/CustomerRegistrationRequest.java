package org.jako.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
