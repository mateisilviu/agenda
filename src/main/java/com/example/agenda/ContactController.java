package com.example.agenda;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @GetMapping("/add")
    public String addContact() {
        return "add";
    }

    @PostMapping("/add")
    public String doAddContact(AddContact entity) {
        Contact c = new Contact();
        BeanUtils.copyProperties(entity, c);
        contactRepository.save(c);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String editContact(@RequestParam Long id, Model model) {
        model.addAttribute("contact", contactRepository.getReferenceById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String editContact(@Valid @ModelAttribute("contact") UpdateContact entity, BindingResult result,
            Model model) {
        if (result.hasErrors()) {
            model.addAttribute("eroare", "Date invalide");
            return "edit";
        }
        Contact c = new Contact();
        BeanUtils.copyProperties(entity, c);
        contactRepository.save(c);
        // return "redirect:/edit?id=" + entity.getId();
        return "redirect:/";
    }

}
