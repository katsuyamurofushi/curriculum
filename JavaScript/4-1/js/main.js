var app = new Vue({
    el: '#app',
    data: {
        list: [],
        addText: '',
        task: 0,
        totalTask: 0,
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
            if (this.list.length === 0) {
                return this.task;
            }//else if (todo.isChecked === true) {
                //this.task--;
            //}
            //リスト要素数に比例
            //リスト要素のcheckedの回答に変動
        }
    }
});