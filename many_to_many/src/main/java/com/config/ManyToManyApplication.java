package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToManyApplication implements CommandLineRunner {

	@Autowired
	private TagRepository tagRepository;

	@Autowired
	private PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		postRepository.deleteAllInBatch();
		tagRepository.deleteAllInBatch();


		Post post = new Post("sample title","sample desc","sample content");

		Tag tag1 = new Tag("sts");
		Tag tag2 = new Tag("eclipse");


		post.getTags().add(tag1);
		post.getTags().add(tag2);

		tag1.getPosts().add(post);
		tag2.getPosts().add(post);

		postRepository.save(post);

	}
}
