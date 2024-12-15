# Homework6

## 2024年12月15日
Builderパターンの演習です。  
コーディングの質に関してもレビューを行うので、高品質なコードを目指してください。  
(必要なところで、インデントやコメント、改行等を適切なところで用いてください。)

### 0. 現状確認
販売店クラスである`Shop`クラスがあると思います。  
`Shop`をインスタンス化した後は店名と商品リストを表示する`printItems`メソッドしか呼べないため、
商品の追加等はインスタンス作成時に行う必要があります。

`Shop`のインスタンス化は`ShopBuilder`を介して行います。  
`ShopBuilder`には`setName`や`addItem`が用意されており、
様々なプロパティを追加した後に`build`を呼ぶことで`Shop`のインスタンスを得られます。

```java
Shop yaoyaShop = Shop.builder()
        .setName("ヤオヤ")
        .addItem(Item.ORANGE, 3)
        .addItem(Item.BANANA, 1)
        .build();

yaoyaShop.printItems();
```

mainメソッドにおいて、
`POTATO`, `CARROT`, `TOMATO`を適当な数ずつ追加した`life`という名前の店舗を作成し、
`printItems`を呼び出してください。


### 1. ラーメン
`RamenBuilder`でラーメンの名前と価格を設定し、トッピングを追加して`Ramen`をビルドする、という手順の演習です。

- `Ramen`クラスと`RamenBulder`クラスを作成してください。
- ToppingのEnumを作成し、5つ以上適当なトッピングを追加してください。

`RamenBuilder`クラスには以下ののメソッドを追加してください。
- `setName`: ラーメンの名前を指定
- `setPrice`: ラーメンの価格を指定
- `addTopping`: トッピングとその価格を追加
- `build`: `Ramen`をインスタンス化して返す


`Ramen`クラスには以下のメソッドを追加してください。
- `builder`: `RamenBuilder`を返す(staticメソッド)
- `printRamenDetail`: 以下の様に出力
```
美味しいラーメン (1520円)
トッピング:
- ネギ
- 味玉
- チャーシュー
```
builderで追加したトッピングが表示され、ラーメンとトッピングの合計金額を()内に表示

※ 文字化け等を回避できなかった場合は日本語じゃなくてもOKです。


### 2. 家
`HouseBuilder`で家の状態を設定して、`House`をビルドする、という手順の演習です。

- `House`クラスと`HouseBuilder`クラスを作成してください。

`HouseBuilder`クラスには以下ののメソッドを追加してください。
- `setAdress`: 建設場所を指定(東京、千葉等)
- `setFloors`: 階数を指定(1,2,3 等)
- `setFloorMaterial`: 床材を指定(フローリング、大理石等)
- `setWallMaterial`: 壁材を指定(木材、鉄筋コンクリート等)
- `build`: `House`をインスタンス化して返す

この際、`adress`は必須パラメータとします。  
`adress`が指定されていない状態でbuildした際に例外を投げてください。

`House`クラスには以下のメソッドを追加してください。

- `builder`: `HouseBuilder`を返す(staticメソッド)
- `printHouseDetail`: 以下のようなフォーマットで表示
```
千葉の家
階数: 2
床材: フローリング
壁材: レンガ
```
指定しなかったパラメータの行は表示しないこと。  
(床材を指定しなかったら床材の行を表示しない)