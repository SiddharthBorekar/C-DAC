package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.LibraryDAO;
import com.app.entity.Library;

import jakarta.transaction.Transactional;

@Service
public class LibraryServiceImpl implements LibraryService {
	
	
	@Autowired
	private LibraryDAO libraryDAO;
	
	@Override
	@Transactional
	public List<Library> getLibrary() {
		return libraryDAO.getLibrary();
	}

	@Override
	@Transactional
	public void saveLibrary(Library library) {
		libraryDAO.saveLibrary(library);
	}

	@Override
	@Transactional
	public Library getLibrary(int theId) {
		return libraryDAO.getLibrary(theId);
	}

	@Override
	public void deleteLibrary(int theId) {
		libraryDAO.deleteLibrary(theId);
	}


}