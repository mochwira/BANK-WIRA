package com.wira.databank.controller;

import com.wira.databank.entity.Nasabah;
import com.wira.databank.repository.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NasabahRestController {
    @Autowired
    private NasabahRepository nasabahRepository;

    @GetMapping("/findnasabah")
    public Nasabah createFindOne(@RequestParam("nasabahId") Integer nasabahId) {
        Nasabah n = new Nasabah();
        Nasabah nb = nasabahRepository.getOne(Integer.valueOf(nasabahId));

        //init
        n.setNasabahId(nb.getNasabahId());
        n.setNamaLengkap(nb.getNamaLengkap());
        n.setAlamat(nb.getAlamat());
        n.setTempatLahir(nb.getTempatLahir());
        n.setTanggalLahir(nb.getTanggalLahir());
        n.setNoKtp(nb.getNoKtp());
        n.setNoHp(nb.getNoHp());

        return n;
    }
}
