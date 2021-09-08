package com.wira.databank.controller;

import com.wira.databank.entity.Nasabah;
import com.wira.databank.repository.NasabahRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NasabahController {
    @Autowired
    private NasabahRepository nasabahRepository;

    @GetMapping("/nasabah")
    public String createIndex(Model model, @RequestParam(defaultValue = "0", name = "page") int page) {
        model.addAttribute("nasabahs", nasabahRepository.findAll(PageRequest.of(page, 8)));
        model.addAttribute("buatPageNasabah", page);
        model.addAttribute ( "buatNasabah", new Nasabah());
        return "/nasabah/nasabah.html";
    }

    @PostMapping("/savenasabah")
    //@Valid BindingResult bindingResult
    public String saveRole(@Valid Nasabah nasabah, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            return "redirect:/nasabah";
        }

        nasabahRepository.save(nasabah);

        return "redirect:/nasabah";
    }

    @GetMapping("/deletenasabah")
    public String deleteNasabah(@RequestParam("nasabahId") Integer nasabahId) {
        //something problem in here
        nasabahRepository.deleteById((Integer) nasabahId);

        return "redirect:/nasabah";
    }
}
