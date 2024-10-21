function main() {
  const input = require("fs")
    .readFileSync("/dev/stdin")
    .toString()
    .trim()
    .split("\n");

  const ans = [];

  for (const line of input) {
    let [a, b, c, d] = line.split(" ").map(Number);

    if (a === 0 && b === 0 && c === 0 && d === 0) break;

    if (a < b) [a, b] = [b, a];
    if (c < d) [c, d] = [d, c];

    let start = 1,
      end = 100;
    let result = 0;

    while (start <= end) {
      const mid = Math.floor((start + end) / 2);

      if (a * mid <= c * 100 && b * mid <= d * 100) {
        result = mid;
        start = mid + 1;
      } else end = mid - 1;
    }

    ans.push(`${result}%`);
  }

  console.log(ans.join("\n"));
}

main();
