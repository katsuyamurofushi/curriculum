/*
・インスタンス化した時にガソリンとナンバーがセットされるようなCarクラスを作成する
・「ガソリンは〇〇です。ナンバーは△△です」と出力される「getNumGas」という関数を作成する
*/

class Car {
    constructor(gas, num) {
        this.gas = gas;
        this.num = num;
    }

    getNumGas(){
        console.log (`ガソリンは${this.gas}です。ナンバーは${this.num}です`);
    }
}
let car = new Car ("〇〇", "△△");
car.getNumGas();