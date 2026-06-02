package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Library;
import com.app.service.LibraryService;

@Controller
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
	private LibraryService libraryService;
	
	
	@GetMapping("/list")
	public String listLibrary(Model theModel) {
		List<Library> theLibrary=libraryService.getLibrary();
		System.out.println(theLibrary);
		theModel.addAttribute("listCust",theLibrary);
		return "BooksList";
		
	}
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Library library=new Library();
		theModel.addAttribute("library",library);
		return "library-form";
	}
	
	@PostMapping("/saveLibrary")
	public String saveLibrary(@ModelAttribute("customer")Library theLibrary) {
		libraryService.saveLibrary(theLibrary);
		return "redirect:/library/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("libraryId")int theId,Model theModel) {
		Library library=libraryService.getLibrary(theId);
		theModel.addAttribute("library",library);
		return "library-form";
	}
	@GetMapping("/delete")
	public String deleteLibrary(@RequestParam("libraryId")int theId,Model theModel) {
		libraryService.deleteLibrary(theId);
		return "redirect:/library/list";
	}
	
	
}
