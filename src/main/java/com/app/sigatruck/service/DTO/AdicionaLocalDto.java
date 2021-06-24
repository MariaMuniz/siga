package com.app.sigatruck.service.DTO;

import javax.validation.constraints.NotBlank;

public class AdicionaLocalDto {
    private Long Id;
    @NotBlank
    private String Local;

    public Long getId() {
        return Id;
    }

    public String getLocal() {
        return Local;
    }
}
