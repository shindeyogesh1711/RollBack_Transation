package com.eclipse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.eclipse.entity.User;
import com.eclipse.repository.UserRepo;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		UserRepo bean = context.getBean(UserRepo.class);
//		User user = new User();
//		user.setName("Vikram");
//		user.setAddress("Vaijapur");
//		bean.save(user);
//		Iterable<User> iterable = bean.findAll();
//		System.out.println(iterable);

		// saveAll method()
//		User user1 = new User();
//		user1.setName("Pranav");
//		user1.setAddress("Yeola");
//		User user2 = new User();
//		user2.setName("Vaibhav");
//		user2.setAddress("Sambhajinagar");
//		User user3 = new User();
//		user3.setName("Soham");
//		user3.setAddress("Nashik");
//		List<User> list=new ArrayList<>();
//		list.add(user1);
//		list.add(user2);
//		list.add(user3);
//		bean.saveAll(list);

//		User user4=bean.findById(1).get();
//		System.out.println(user4);

//		List<User> list1=(List<User>)bean.findAll();
//		System.out.println(list1);

//		List<Integer> listofId=Arrays.asList(1,2,3);
//		Iterable<User> allById=bean.findAllById(listofId);
//		System.out.println(allById);

//		long count=bean.count();
//		System.out.println(count);

//		bean.deleteById(3);

//		User user5 = new User();
//		user5.setName("Vaibhav");
//		user5.setAddress("Sambhajinagar");
//		System.out.println("before saving into db:"+user5);
//		User save=bean.save(user5);
//		System.out.println("after saving into db:"+save);
//		bean.delete(user5);

//		User user6 = new User();
//		user6.setName("Pranav");
//		user6.setAddress("Pune");
//		User user7 = new User();
//		user7.setName("Pranav");
//		user7.setAddress("Mumbai");
//		
//		List<User> list2=Arrays.asList(user6,user7);
//		bean.saveAll(list2);	
//		
//		List<User> list3=bean.findByName("Pranav");
//		System.out.println(list3);

//		List<User> list4=bean.findByName("Pranav");
//		System.out.println(list4);
		
//		List<User> list5=bean.findByAddress("Pune");
//		System.out.println("object by address:"+list5);

//		List<User> list5=bean.findByNameAndAddress("Vaibhav", "Sambhajinagar");
//		System.out.println(list5);
		
//------------------------------------------------------------------------------------------------------------------------
		
//		List<User> list=bean.findById("1");
//		System.out.println(list);
		
//		List<User> list=bean.findByIdAndAddress("2","Sambhajinagar");
//		System.out.println(list);
		
//		List<User> list=bean.findByIdAndName("6","Pranav");
//     	System.out.println(list);
     			
//		List<User> list=bean.findByNameNot("Vikram");
//		System.out.println(list);
		
//		List<User> list=bean.findByNameIsNull();
//		System.out.println(list);
		
//		List<User> list=bean.findByNameIsNotNull();
//		System.out.println(list);
	
//		List<User> list=bean.findByNameStartingWith("V");
//		System.out.println(list);
		
//		List<User> list=bean.findByNameStartingWith("P");
//		System.out.println(list);	
		
//		List<User> list=bean.findByNameStartingWith("Z");
//		System.out.println(list);
		
//		List<User> list=bean.findByNameEndingWith("v");
//		System.out.println(list);
		
//		List<User> list=bean.findByNameEndingWith("hav");
//		System.out.println(list);
		
//		List<User> likePattern=bean.findByNameLike("p%v%");
//		System.out.println(likePattern);
		
//		List<User> likePattern=bean.findByNameLike("v%a%");
//		System.out.println(likePattern);
		
//		List<User> list=bean.findByNameOrderByName("Vaibhav,Pranav");
//		System.out.println(list);
		
//		List<User> list=bean.findByNameOrderByName("Vaibhav,Pranav");
//		System.out.println(list);
		
//		List<User> list=bean.findByNameOrderByNameAsc("Vaibhav,Pranav");
//		System.out.println(list);
		
//		List<User> list=bean.findByNameOrderByNameDesc("Vaibhav,Pranav");
//		System.out.println(list);
		
//		List<User> user=bean.deleteById(6);
//		System.out.println(user);
		
	}
}
