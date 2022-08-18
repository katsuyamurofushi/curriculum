while True:
    try:
        print()
        print('1: ValueError例外を発生')
        print('2: IndexError例外を発生')
        print('3: 例外を発生させない')
        print('4: 終了')
        number = int(input('選択してください。: '))
        # 問①：if文を用いて、以下の画像のように処理されるように記述しましょう。
        ##ここに書く
        print('↓')

        if number== 1:
            tmp = int('hoge')
            continue

        elif number== 2:
            tmp = 'range'[6]
            continue
        
        elif number== 3:
            print('例外は発生させませんでした')
            print('↓')
            print('もう一度選択しましょう')
            continue

        else:
            print('終了します')
            print('↓')
            break

    # 問②：else節を用いて、以下の画像のように処理されるように記述しましょう。
    ##ここに書く
    except ValueError as e:
        print('Value Error')
        print(e.args)
        print('↓')
        print('もう一度選択しましょう')
    except IndexError as e:
        print('Index Error')
        print(e.args)
        print('↓')
        print('もう一度選択しましょう')
    
print('無限ループを終了します')