function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const [n, g] = input[0].split(" ").map(Number);
  const arr = Array(n).fill(0);
  let idx = 0;
  let checked = false;

  for (let i = 1; i <= g; i++) {
    let m = Number(input[i]);

    while (m > 0) {
      if (checked) {
        if (arr[idx] === 2) {
          idx++;
        } else {
          arr[idx]++;
          idx++;
          m--;
        }
      } else {
        if (m === 1) {
          arr[idx] = 1;
          m--;
          idx++;
        } else {
          arr[idx] = 2;
          m -= 2;
          idx++;
        }

        if (idx === n) {
          checked = true;
          idx = 0;
        }
      }
    }
  }

  arr.forEach((num) => console.log(num));
}

main();
