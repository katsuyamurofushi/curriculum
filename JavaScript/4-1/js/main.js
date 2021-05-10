var app = new Vue({
    el: '#app',
    data: {
        list: [],
        addText: '',
        message: '現在タスクはありません',
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
            this.message = '';
        },
        deleteBtn: function() {
            this.list = this.list.filter(function(todo) {
                return !todo.isChecked;
            });
            if (this.list == []) {
                this.message = '現在タスクはありません';
            }
        }
        //削除して消すというよりは 「チェックがついていないタスクを返して表示する」 という内容の処理
        
    }
});