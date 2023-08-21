package com.virtualkey.util;



import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;



	public class FileService {
		
		
		ArrayList<String> listOfFiles = new ArrayList<String>();
		
		
		public void updateList() {
			// Updating the ArrayList with the existing filenames 
			File[]files = new File("/home/panagiotiskalog/Desktop/Phase1 Capstone Project v/VirtualKey/Demo/").listFiles();
			for (File file : files) {
				if (file.isFile()){
					listOfFiles.add(file.getName());
				}
			}
		}

		
		public void addFile(String nameOfText)  {
			// Creating an empty file in a directory using an absolute path
			File myFile = new File("/home/panagiotiskalog/Desktop/Phase1 Capstone Project v/VirtualKey/Demo/"+nameOfText);
			try {
				if (myFile.createNewFile()) {
					System.out.println("File created successfully");
					listOfFiles.add(nameOfText);
				}else {
					System.out.println("File already exists");
				}
			} catch (IOException e) {
					System.out.println("An error occured");
			}
			
			// System.out.println(listOfFiles); // displays all current entries
			
		}
		
		
		public void deleteFile(String nameOfText) {
			// Deleting a file located in a specific directory. If not, an informative message will appear 
			File delFile = new File("/home/panagiotiskalog/Desktop/Phase1 Capstone Project v/VirtualKey/Demo/"+nameOfText);
			if (delFile.delete()) {
				System.out.println("File deleted successfully");
				listOfFiles.remove(nameOfText);
			}else {
				System.out.println("File not found");
			}
			
			
			// System.out.println(listOfFiles); // displays all current entries
			
		}
		
		public void searchFile(String nameOfText) {
			// Searching a file located in a specific directory. If not found, an informative message will appear
			if (listOfFiles.contains(nameOfText)) {
				System.out.println("The file " +nameOfText + " exists in the List");
			}else {
				System.out.println("The file " +nameOfText + " does not exist in the List");
			}
		}
		
		public void ascOrder() {
			Collections.sort(listOfFiles); // sorting the current filenames in ascending order
			System.out.println("Sorted List in Ascending order : " + listOfFiles);
			// System.out.println(listOfFiles); // displays all the current entries
		}
		
		
		
	}


