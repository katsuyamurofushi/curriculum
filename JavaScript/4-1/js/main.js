var app = new Vue({
    el: '#app',
    data: {
        list: [],
        addText: '',
        totalTask: 0,
        keyword: '',
        searchList: []
    },
    //watchでlistの変更を監視
    watch: {
        list: {
            handler: function() {
                //localStorageにデータを保存
                localStorage.setItem("list", JSON.stringify(this.list));
            },
            deep: true
        }
    },
    //マウントされた時にlocalStorageからデータを取得
    mounted: function() {
        this.list = JSON.parse(localStorage.getItem("list")) || [];
    },
    methods: {
        addToDo: function() {
            if (this.addText !== '') {
                this.list.push({
                    text: this.addText, 
                    isChecked: false, //Todoを追加した瞬間は、当然タスクはまだ終わっていないので、チェックフラグは falseにしておく
                });
            }
            this.addText = '';
        },
        deleteBtn: function() {
            this.list = this.list.filter(function(todo) {
                return !todo.isChecked;
            });
        },
        //削除して消すというよりは 「チェックがついていないタスクを返して表示する」 という内容の処理
        display: function() {
            if (this.list.length === 0) {
                return true;
            }else{
                return false;
            }
        }
    },
    computed: {
        Counttotal: function() {
            this.totalTask = this.list.length;
            return this.totalTask;
        },
        Counttask: function() {
            //タスクが入っている配列をコピーする
            notCheckedList = this.list.concat()

            //this.listの中身を全て確認するためにforEach文を仕様する
            this.list.forEach(todo => {
                if (todo.isChecked) {
                    //isChecked が true のものは notCheckedList から抜く
                    notCheckedList.pop(todo)
                }
            });
            //notCheckedList に残っているのは check されていないタスク
            //その長さを返せば正しく表示できる
            return notCheckedList.length;
        },
        SearchTask: function() {
            this.searchList = [];
            this.list.forEach(todo => {
                if (todo.text.indexOf(this.keyword) != -1) {
                    this.searchList.unshift(todo)
                }
            });
            return this.searchList;
        }
    }
});