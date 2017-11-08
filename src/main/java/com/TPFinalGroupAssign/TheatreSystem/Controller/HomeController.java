package com.TPFinalGroupAssign.TheatreSystem.Controller;


import com.TPFinalGroupAssign.TheatreSystem.Domain.Admin;
import com.TPFinalGroupAssign.TheatreSystem.Domain.Users;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.AdminRepository;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.ReservationRepository;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReservationRepository reservationRepository;


    @RequestMapping(method = RequestMethod.POST)
    public String search(HttpServletRequest request) {
        String selectedOperation = request.getParameter("option");

        if(selectedOperation.equals("viewAdmin")) {
            Admin admin = adminRepository.findOne(Long.parseLong(request.getParameter("search")));
            if (admin!=null)
                return "redirect:/home/" + admin.getId() + "/view_admin";
            else
                return "redirect:/errorpage";
        }

        if(selectedOperation.equals("editAdmin")){
            Admin admin = adminRepository.findOne(Long.parseLong(request.getParameter("search")));
            if(admin!=null)
                return "redirect:/home/" + admin.getId() + "/update_admin";
            else
                return "redirect:/errorpage";
        }

        if(selectedOperation.equals("deleteAccount")) {
            Admin admin = adminRepository.findOne(Long.parseLong(request.getParameter("search")));
            if (admin!=null)
                return "redirect:/home/" + admin.getId() + "/delete";
            else
                return "redirect:/errorpage";
        }

        if(selectedOperation.equals("viewUsers")) {
            Users users = userRepository.findOne((long) Integer.parseInt(request.getParameter("search")));
            if(users!=null)
                return "redirect:/home/" + users.getUserID() + "/view";
            else
                return "redirect:/errorpage";
        }

        if(selectedOperation.equals("editUsers")){
            Users users = userRepository.findOne((long) Integer.parseInt(request.getParameter("search")));
            if (users!=null)
                return "redirect:/home/" + users.getUserID() + "/update_users";
            else
                return "redirect:/errorpage";
        }
        return "redirect:/home";
    }
}
