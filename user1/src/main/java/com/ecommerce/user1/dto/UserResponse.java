package com.ecommerce.user1.dto;

import com.ecommerce.user1.models.UserRole;
import lombok.Data;

@Data
public class UserResponse {
    private String id;
    private String keyCloakId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private UserRole role;
    private AddressDTO address;
}
