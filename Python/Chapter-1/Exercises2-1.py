# coding: UTF-8
#問2-1.下の画像のような出力になるように、コードを完成させてください。
all_place = ["札幌","東京","横浜","大阪","名古屋","福岡"]
wait_place = ["札幌","大阪"]
get_place = ["横浜"]

for place in all_place:
    if place in get_place:
        print(place + "のチケットが当選しました！")
    elif place in wait_place:
        print(place + "のチケットは結果待ち")
    else:
        print(place + "のチケットは落選しました")
#問2-2.下の画像のような出力になるように、問2-1の続きにコードに追加してください。
print(get_place)
get_place += wait_place
print(get_place)
s = "{0[0]}と{0[1]}と{0[2]}のチケットが当選しました！"
print(s.format(get_place))