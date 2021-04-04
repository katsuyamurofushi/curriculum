class Taiyaki {

    //コンストラクタ
    constructor(taste) {
        this.taste = taste;
    }

    //メソッド（関数）作成
    nakami() {
        console.log(`中身は${this.taste}です。`);
    }
}
//オブジェクト作成
let anko = new Taiyaki('あんこ');
anko.nakami();

let kurimu = new Taiyaki('クリーム');
kurimu.nakami();

let cheese = new Taiyaki('チーズ');
cheese.nakami();
