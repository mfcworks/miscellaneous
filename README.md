# miscellaneous

## Filer.java

簡易的なテキストファイル書き込みユーティリティです。
このクラスを使うと次の処理が比較的簡単に記述できます。
* ファイルを作成する、または既存のファイルを開く
* ファイルにデータや文字列を書き込む
* ファイルの内容を保存する

### ダウンロード
To Be Edited.

### メソッド
##### ファイルを開く
TBE
##### データ・文字列の書き込み
TBE
##### 保存
TBE


### 使用例
```java
// Sample.java
public class Sample {
    public static void main(String[] args) {
        // Filerオブジェクトを作成する。
        Filer file = new Filer("sample.txt");

        // x を 0 から 1000 まで 10 ずつ変えてデータを記録する
        for (int x = 0; x <= 1000; x += 10) {
            // func() はxを入力として出力を返す関数。
            double y = func(x);
            file.putln(x + "\t" + y);
        }

        // ファイルを保存して終わる
        file.save();
    }
}
```
