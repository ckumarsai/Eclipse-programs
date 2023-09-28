package countstring;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

public class PdfReader {

	public static void main(String[] args) {

		String path = "C:\\Users\\schinthakunta\\Downloads\\sample.pdf";
		try {
			PDDocument document = PDDocument.load(path);

			/**
			 * PDfTextStripper used to read the PDF line by line
			 */
			PDFTextStripper pdftext = new PDFTextStripper();

			String pdfTextData = pdftext.getText(document);
//			System.out.println(pdfTextData);
			int count = document.getNumberOfPages();
			System.out.println("Number of pages =" + count);
			int cnt = 0;
			String s;
			String[] buffer;

			/**
			 * Scanner is used to read input from the used
			 */
			Scanner scan = new Scanner(System.in);
			System.out.println("Input the phrase to find");
			String phrase = scan.nextLine();
			File file = new File(path);
			FileReader fr = new FileReader(file);
			BufferedReader bfr = new BufferedReader(fr);
			PDDocument doc = PDDocument.load(file);
			PDFTextStripper findPhrase = new PDFTextStripper();
			String text = findPhrase.getText(doc);
			String PDF_content = text;
			String result = PDF_content.contains(phrase) ? "Yes" : "No";
			System.out.println(result);
			doc.close();

			while ((s = bfr.readLine()) != null) {
				buffer = s.split(" ");
				for (String chr : buffer) {
					if (chr.equals(phrase)) {
						cnt++;
					}
				}
			}
			if (cnt == 0) {
				System.out.println("Word not found!");
			} else {
				System.out.println("Word : " + phrase + " found! Count : " + cnt);
			}

			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}