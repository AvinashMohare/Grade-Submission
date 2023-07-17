package com.grades.gradesubmission;

import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    
    List<Grade> studentGrades = Arrays.asList(
        new Grade("Harry", "Potions", "c++"),
        new Grade("Peter", "Science", "a++"),
        new Grade("Parker", "Eng", "b++")
    );
    
    @GetMapping("/grades")
    public String getGrades(Model model){
        model.addAttribute("grades", studentGrades);
        return "grades";
    }
}
