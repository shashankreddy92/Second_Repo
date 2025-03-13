package com.notepadpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class NotePad_Write_Class {

	public static void main(String[] args) {
	
		try {
			
			//Create connection for file write
			File fo = new File("logo\\outputdatafile.txt");
			
			//Create Connection for File Writer
			FileWriter fw = new FileWriter(fo);
			
			//Create Connection for BufferWriter
			BufferedWriter bw = new BufferedWriter(fw);
			
			//How to Write the data into the note pad
			bw.write("http://www.gmail.com");
			bw.newLine();
			bw.write("QAtester@gmail.com");
			
			//How to Save the Note Pad File in Runtime
			bw.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

}
