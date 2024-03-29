package comonlibs.implementation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import comonlibs.contracts.IScreenshot;

public class ScreenshotControl implements IScreenshot {

	TakesScreenshot camera;

	public ScreenshotControl(WebDriver driver) {
		camera = (TakesScreenshot) driver;
	}

	@Override
	public void captureAndSaveScreenshot(String filename) throws Exception {
		filename = filename.trim();

		File imgFile, tmpFile;

		imgFile = new File(filename);

		if (imgFile.exists()) {
			throw new Exception("File already exists...");
		}

		tmpFile = camera.getScreenshotAs(OutputType.FILE);

		FileUtils.moveFile(tmpFile, imgFile);

	}

}
