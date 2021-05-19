package com.rays;
import java.util.List;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rays.dao.TraineesDAO;
import com.rays.dao.TrainnesDAOImpl;
import com.rays.model.Trainees;

public class TraineesMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		TraineesDAO tDAO = (TraineesDAO) context.getBean("traineeDAO");
		Scanner sc= new Scanner(System.in);
		
		
		
		do {
			int result =0;
			System.out.println("Select your Option");
			System.out.println("1.Add Trainees\n2.Show All Trainees\n3.Get Trainnes By Associate ID");
			System.out.println("4.Update Trainees\n5.Delete Trainees");
			int option = sc.nextInt();
		switch (option) {
		case 1:
			result = tDAO.insertTrainees(getTrainees());
			if(result>0) {
				System.out.println("Trainees Added Successfully...");
			}else {
				System.out.println("Trainees not Added due to some Problem");
			}
			break;
		case 2:
			List<Trainees> tList = tDAO.getAllTrainees();
			for(Trainees t :tList) {
				System.out.println(t);
			}
			break;
		case 3:
			System.out.println("Enter Associate ID : ");
			int aid = sc.nextInt();
			Trainees t = tDAO.getTraineesById(aid);
			System.out.println(t);
			break;
		case 4:
			result =tDAO.updateTrainees(getTrainees());
			if(result>0) {
				System.out.println("Trainees Updated Successfully...");
			}else {
				System.out.println("Trainees not Updated due to wrong associate ID..");
			}
			break;
		case 5:
			System.out.println("Enter Associate ID : ");
			int aid1 = sc.nextInt();
			result = tDAO.deleteTrainees(aid1);
			if(result>0) {
				System.out.println("Trainees Deleted Successfully...");
			}else {
				System.out.println("Trainees not Deleted due to wrong associate ID..");
			}
		default:
			break;
		}
		System.out.println("DO you want to Continue  1.Yes 2.No");
		}while(sc.nextInt()==1);
	
		
	}
	
	static Trainees getTrainees() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Associate ID : ");
		int aid = sc.nextInt();
		System.out.println("Enter Trainee Name : ");
		String tName = sc.next();
		System.out.println("Enter Age: ");
		int tAge = sc.nextInt();
		System.out.println("Enter City :");
		String tCity = sc.next();
		Trainees T = new Trainees(aid, tName, tAge, tCity);
		return T;
	}

}
