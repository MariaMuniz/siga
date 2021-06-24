package com.app.sigatruck.Services;

import com.app.sigatruck.model.Local;
import com.app.sigatruck.repository.LocalRepository;
import com.app.sigatruck.service.DTO.AdicionaLocalDto;


public class ServiceLocal {

    private LocalRepository lr;

    public Long adicionaLocal(AdicionaLocalDto dto) {
        Local    local  = new Local();
        local.setId(dto.getId());
        local.setLocal(dto.getLocal());



        return 1L;
    }
}
