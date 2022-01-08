package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		 List<Department> obj = new ArrayList<>();
		 obj.add(new Department(1, "Luan"));
		 obj.add(new Department(2, "Criança"));
		 
		 for (Object object : obj) {
			System.out.println(object);
		}
	}

}
