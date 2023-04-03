package phase1project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class simproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************************************");
		System.out.println("**********File Handling Project*******");
		System.out.println("**************************************");
		System.out.println("**********Sivaranjini*********");
		System.out.println("**************************************");
		System.out.println("**********Full Stack Developer********");
		System.out.println();
		
		try (//Initialization
		Scanner sc = new Scanner(System.in)) {
			char ch ;
			String fileName;
			
			
	
			
			do {
				System.out.println("Select Options to perform Operations. \n");
				System.out.println("1. File Creation");
				System.out.println("2. File List");
				System.out.println("3. File Delete");
				System.out.println("4. File Search");
				System.out.println("5. Exit");
				
				
				File directory = new File("D:\\phase1java");
				String []file_List= directory.list();
				//Taking User Input
				int choice = sc.nextInt();
				switch(choice) {


				//Adding Files to Directory
				case 1:
				System.out.println("Enter File name you want to add in directory.");
				fileName = sc.next();
				 File file = new File("D:\\phase1java\\"+ fileName +".txt");
				 if (file.exists()) {
					System.out.println("File already exists!!!");
				 }
				 else {
					 try {
						file.createNewFile();
						System.out.println("File created...");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				 }
				 break;
				
				//Printing File list  
				case 2:
					
					if(file_List == null) {
						System.out.println("There isn't any files available in the directory.");
					}
					else {
						System.out.println("Files Available in the Directory. \n");
						for (int i = 0; i<file_List.length;i++) {
							System.out.println(file_List[i]);
						}
					}
					break;
				
				//Deleting File from directory
				case 3:
					System.out.println("Enter the file name which you want to delete.");
					fileName = sc.next();
					
					int flag = 0;
					
					if (file_List==null) {
						System.out.println("There isn't any file available in the directory.");
					}
					else {
						for (int i =0; i<file_List.length;i++) {
							String delete_file = file_List[i];
							if (delete_file.equalsIgnoreCase(fileName)) {
File del_file = new File("D:\\phase1java\\"+delete_file);
								if (del_file.delete()) {
									System.out.println("File deleted Successfully.");
								}
								else {
									System.out.println("Failed to delete File.");
								}
								flag = 1;
							}
						}
							
					}
					
					if (flag == 0) {
						System.out.println("File not Found");
					}
					break;
				
				
				//Searching File in Directory
				case 4: 
					
					
					int flag_s = 0;
					
					if (file_List == null) {
						System.out.println("There is nt any file available in the directory.");
					}
					else {
						System.out.println("Enter the filename you want to search.");
						fileName = sc.next();
						for (int i = 0; i<file_List.length;i++) {
							String search_file = file_List[i];
							if (search_file.equalsIgnoreCase(fileName)) {
								System.out.println(search_file + " found!!");
								flag_s = 1;
							}
						}
						if (flag_s == 0) {
							System.out.println("File Not Found!!");
						}
					}
					break;
				
				
				//Exiting
				case 5:
					System.out.println("Thank You User!!");
					break;
					
				default:
					System.out.println("Your Input is incorrect. Please select the correct input!!");
					break;
				}
				System.out.println("Do you want to continue Type (y or n) \n");
				ch = sc.next().charAt(0);
				while(ch != 'Y' &&ch != 'y' &&ch != 'N' &&ch != 'n') {
					System.out.println("Wrong input..");
					System.out.println("Do you want to continue Type (y or n) \n");
					ch = sc.next().charAt(0);    
				}
			
				
			}while(ch == 'Y' || ch == 'y');
		}
	

}

	}

