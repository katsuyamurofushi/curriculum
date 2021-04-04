let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven(num) {
    return num % 2 === 0;
}

console.log(numbers.filter(isEven) + 'は偶数です');