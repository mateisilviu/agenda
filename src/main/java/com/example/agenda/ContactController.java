package com.example.agenda;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ContactController {

    final ContactRepository contactRepository;

    @GetMapping("/")
    public String getAllContacts(Model model) {
        var contacte = contactRepository.findAll();
        model.addAttribute("contacts", contacte);
        return "index";
    }

}
