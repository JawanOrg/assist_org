package test;

import java.io.File;
import java.io.FileReader;

/**
 * @author 李猛
 */
public class MemoryTest {
	public void test() {
		try {
			String filepath = "com/regaltec/ida40/sa/common/config/ibatis";
			File file = new File(filepath);
			if (!file.isDirectory()) {
				System.out.println("文件");
				System.out.println("path=" + file.getPath());
				System.out.println("absolutepath=" + file.getAbsolutePath());
				System.out.println("name=" + file.getName());

			} else if (file.isDirectory()) {
				System.out.println("文件夹");
				String[] filelist = file.list();
				String txt = "";
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filepath + "\\" + filelist[i]);
					if (!readfile.isDirectory()) {
						System.out.println("path=" + readfile.getPath());
						System.out.println("absolutepath="
								+ readfile.getAbsolutePath());
						System.out.println("name=" + readfile.getName());
						FileReader reader = new FileReader(readfile);
						int fileLen = (int) readfile.length();
						char[] chars = new char[fileLen];
						reader.read(chars);
						txt += String.valueOf(chars);
						txt += String.valueOf(chars);
						txt += String.valueOf(chars);
						txt += String.valueOf(chars);
						txt += String.valueOf(chars);
						txt += String.valueOf(chars);
						txt += String.valueOf(chars);
						txt += String.valueOf(chars);
						reader.close();
					}
				}

				System.out.println("\n\n\n" + txt + "\n\n\n");
			}
		} catch (RuntimeException e) {
			System.out.println("readfile()   RuntimeException:" + e);
		} catch (Exception e) {
			System.out.println("readfile()   Exception:" + e.getMessage());
		}
	}
}