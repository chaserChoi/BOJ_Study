function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  var Arr = input.map(Number);

  while (true) {
    var n = Arr.shift();
    if (n == 0) break;

    var arr = [];
    for (var i = 0; i < n; i++) arr.push(Arr.shift());
    arr.sort((a, b) => a - b);
    arr.shift();
    arr.pop();

    var sum = arr.reduce((a, b) => a + b);
    var avg = Math.floor(sum / arr.length);

    console.log(avg);
  }
}

main();
