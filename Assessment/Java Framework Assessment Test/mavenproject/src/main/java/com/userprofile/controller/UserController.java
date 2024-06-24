package com.userprofile.controller;

import com.userprofile.model.User;
import com.userprofile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String registerUser(@ModelAttribute("user") User user, @RequestParam("profilePicture") MultipartFile file, HttpServletRequest request) {
        if (!file.isEmpty()) {
            try {
                String path = request.getServletContext().getRealPath("/uploads/");
                file.transferTo(new File(path + file.getOriginalFilename()));
                user.setProfilePicture(file.getOriginalFilename());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        userService.registerUser(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, HttpSession session, Model model) {
        User user = userService.getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("user", user);
            return "redirect:/profile";
        }
        model.addAttribute("error", "Invalid email or password");
        return "login";
    }

    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping("/change-password")
    public String changePassword() {
        return "change_password";
    }

    @PostMapping("/change-password")
    public String updatePassword(@RequestParam("currentPassword") String currentPassword, @RequestParam("newPassword") String newPassword, HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        if (user == null || !user.getPassword().equals(currentPassword)) {
            model.addAttribute("error", "Current password is incorrect");
            return "change_password";
        }
        user.setPassword(newPassword);
        userService.registerUser(user);
        return "redirect:/profile";
    }

    @GetMapping("/forgot-password")
    public String forgotPassword() {
        return "forgot_password";
    }

    @PostMapping("/forgot-password")
    public String sendOtp(@RequestParam("email") String email, Model model) {
        // Send OTP logic
        model.addAttribute("message", "OTP sent to your email");
        return "forgot_password";
    }
}
