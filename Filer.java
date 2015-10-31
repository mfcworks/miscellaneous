import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 簡易テキストファイル書き込みユーティリティ
 * @author T. Miyazaki
 *
 */
public class Filer {
	// 改行文字
	private String br = System.getProperty("line.separator");
	private FileWriter fw = null;

	/**
	 * ファイル書き込みクラスを初期化します。
	 * @param 保存するファイル名(拡張子付きで指定)
	 * @param 既存のファイルの最終行から追加する場合、true
	 */
	public Filer(String fileName, boolean append) {
		String cd = new File(".").getAbsoluteFile().getParent();

		try {
			fw = new FileWriter(cd + "\\" + fileName, append);
		} catch (IOException e) {
			System.out.println("ファイルを開けません!");
		}
	}

	/**
	 * ファイル書き込みクラスを初期化します。
	 * 同名のファイルが既にある場合、ファイル内容がリセットされます。
	 * @param 保存するファイル名(拡張子付きで指定)
	 */
	public Filer(String fileName) {
		this(fileName, false);
	}

	/**
	 * ファイルの最終行に追記します。改行はされません。
	 * @param 追記する文字列
	 */
	public void put(String string) {
		try {
			fw.write(string);
		} catch (IOException e) {
			System.out.println("ファイルに追記できません!");
		}
	}

	/*
	 * put()のオーバーロードメソッド達：
	 */

	public void put(boolean b) {
		put(String.valueOf(b));
	}

	public void put(char c) {
		put(String.valueOf(c));
	}

	public void put(char[] s) {
		put(String.valueOf(s));
	}

	public void put(double d) {
		put(String.valueOf(d));
	}

	public void put(float f) {
		put(String.valueOf(f));
	}

	public void put(int i) {
		put(String.valueOf(i));
	}

	public void put(long l) {
		put(String.valueOf(l));
	}

	public void put(Object obj) {
		put(String.valueOf(obj));
	}

	/**
	 * ファイルの最終行に追記し、改行します。
	 * @param 追記する文字列
	 */
	public void putln(String string) {
		try {
			fw.write(string + br);
		} catch (IOException e) {
			System.out.println("ファイルに追記できません!");
		}
	}

	/*
	 * putln()のオーバーロードメソッド達：
	 */

	public void putln() {
		putln("");
	}

	public void putln(boolean b) {
		putln(String.valueOf(b));
	}

	public void putln(char c) {
		putln(String.valueOf(c));
	}

	public void putln(char[] s) {
		putln(String.valueOf(s));
	}

	public void putln(double d) {
		putln(String.valueOf(d));
	}

	public void putln(float f) {
		putln(String.valueOf(f));
	}

	public void putln(int i) {
		putln(String.valueOf(i));
	}

	public void putln(long l) {
		putln(String.valueOf(l));
	}

	public void putln(Object obj) {
		putln(String.valueOf(obj));
	}

	/**
	 * ファイルを保存して終了します。
	 */
	public void save() {
		try {
			fw.close();
		} catch (IOException e) {
			System.out.println("ファイルを保存できません!");
		}
	}
}
