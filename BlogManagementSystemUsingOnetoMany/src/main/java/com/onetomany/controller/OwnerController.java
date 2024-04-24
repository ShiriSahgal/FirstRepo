package com.onetomany.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.entity.Blog;
import com.onetomany.entity.Owner;
import com.onetomany.repository.BlogRepository;
import com.onetomany.repository.OwnerRepository;



@RestController
@RequestMapping("/owner")
public class OwnerController {
	  @Autowired
	    private OwnerRepository ownerRepository;

	    @Autowired
	    private BlogRepository blogRepository;
	
	 @PostMapping("/saveOwner")
	    public String saveOwner(@RequestBody Owner owner) {
	        System.out.println("Owner save called...");

		// a new Owner
	        Owner ownerIn = new Owner(owner.getName(), owner.getEmail());

		// list of Blog
	        List<Blog> blogs = new ArrayList<>();
	        for (Blog blogIn : owner.getBlogList()) {
	            // new Blog
	            Blog blog = new Blog(blogIn.getTitle(), blogIn.getCategory(), blogIn.getContent());
	            // set owner to Blog
	            blog.setOwner(ownerIn);
	            // add blog to list
	            blogs.add(blog);
	        }
	        
	        // add blog list to Owner
	        ownerIn.setBlogList(blogs);

		// save Owner
	        Owner ownerOut = ownerRepository.save(ownerIn);
	        System.out.println("Owner out :: " + ownerOut);

	        System.out.println("Saved!!!");
	        return "Owner saved!!!";
	    }

	    
	    @GetMapping("/getOwner/{id}")
	    public Owner getOwner(@PathVariable(name = "id") int id) {
	        
	       
	        return ownerRepository.getById((id));
	    }

	    @GetMapping("/getBlog/{id}")
	    public Blog getBlog(@PathVariable(name = "id") int id) {
	        
	        return blogRepository.getById(id);
	    }
}
