# JavaUnderstand

Javaのクラスの作り方
- メンバ変数
- メソッド

インターフェイス
newすることができない。実装するときは、implementを使用する
- 変数
- 抽象メソッド

```
// コンパイル時に public static finalがつく
interface Englishable {
    String LANG = "英語";
    void displayEng();
}
```

抽象クラス
- 