package com.groupeisi.jenkinsProject.Controller;

import com.groupeisi.jenkinsProject.Entities.User;
import com.groupeisi.jenkinsProject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public String getAllUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }

    @GetMapping("/users/new")
    public String showAddForm(User user) {
        return "user-add";
    }

    @PostMapping("/users/add")
    public String addUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "user-add";
        }

        userRepository.save(user);
        return "redirect:/users";
    }

    @GetMapping("/users/edit/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Utilisateur invalide avec l'id : " + id));

        model.addAttribute("user", user);
        return "user-update";
    }

    @PostMapping("/users/update/{id}")
    public String updateUser(@PathVariable("id") Long id, @Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            user.setId(id);
            return "user-update";
        }

        userRepository.save(user);
        return "redirect:/users";
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id, Model model) {
        userRepository.deleteById(id);
        return "redirect:/users";
    }
}

