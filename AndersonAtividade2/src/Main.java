
import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;

public class Main {

	public static void main(String[] args) {

		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("https://pt.wikipedia.org/wiki/Descoberta_do_Brasil").get();
			System.out.println(doc.getElementsByTag("title"));

			org.jsoup.select.Elements titleElements = doc.getElementsByTag("title");

			if (!titleElements.isEmpty()) {
				org.jsoup.nodes.Element titleElement = titleElements.first();
				String titleText = titleElement.text();

				String txtFilePath = "titulo.txt";
				try (FileWriter writer = new FileWriter(txtFilePath)) {
					writer.write(titleText);
				}

				System.out.println("Título salvo no arquivo " + txtFilePath);
			} else {
				System.out.println("Nenhuma tag <title> encontrada na página.");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
