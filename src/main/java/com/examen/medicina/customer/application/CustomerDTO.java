package com.examen.medicina.customer.application;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDTO {
    private String idcustomer;
    private String namecustomer;
    private String lastnamecustomer;
    private String codecitycustomer;
    private String emailcustomer;
    private String birthdate;
    private float lon;
    private float latitud;
    private String city;
}
