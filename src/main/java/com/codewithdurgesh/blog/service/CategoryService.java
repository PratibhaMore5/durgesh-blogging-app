package com.codewithdurgesh.blog.service;

import java.util.List;

import com.codewithdurgesh.blog.payloads.CategoryDto;

public interface CategoryService {
	// create
	public CategoryDto createCategory(CategoryDto categoryDto);

	// update
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// delete
	public void deleteCategory(Integer categoryId);

	// get single
	public CategoryDto getCategory(Integer categoryId);

	// get all
	public List<CategoryDto> getCategories();

}